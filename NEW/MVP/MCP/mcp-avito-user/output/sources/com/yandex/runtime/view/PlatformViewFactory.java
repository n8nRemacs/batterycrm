package com.yandex.runtime.view;

import R21.b;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.yandex.runtime.graphics_state.GraphicsViewState;
import com.yandex.runtime.graphics_state.GraphicsViewType;
import com.yandex.runtime.logging.Logger;
import com.yandex.runtime.vulkan_launcher.VulkanLauncher;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public class PlatformViewFactory {
    private static final Set<String> VULKAN_WHITE_LIST = new HashSet(Arrays.asList("Nexus 5X"));

    public enum Attribute {
        MOVABLE,
        NONINTERACTIVE,
        RENDER_DEBUG,
        VULKAN_ENABLED
    }

    public static final Set<Attribute> convertAttributeSet(Context context, AttributeSet attributeSet) {
        HashSet hashSet = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.k.f14084a, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
                hashSet.add(Attribute.MOVABLE);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
                hashSet.add(Attribute.NONINTERACTIVE);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(2, false)) {
                hashSet.add(Attribute.RENDER_DEBUG);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
                hashSet.add(Attribute.VULKAN_ENABLED);
            }
            typedArrayObtainStyledAttributes.recycle();
            return hashSet;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public static PlatformView getPlatformView(Context context, Set<Attribute> set) {
        PlatformView platformVulkanSurfaceView;
        if (set == null) {
            set = new HashSet<>();
        }
        boolean zContains = set.contains(Attribute.RENDER_DEBUG);
        boolean zIsAndroidGo = isAndroidGo(context);
        if (zIsAndroidGo) {
            Logger.warn("Android Go detected. Do not use vulkan.");
        }
        boolean z12 = set.contains(Attribute.VULKAN_ENABLED) || VulkanLauncher.isVulkanEnabled();
        if (!z12) {
            Logger.warn("Vulkan is not enabled. Do not use vulkan.");
        }
        if (set.contains(Attribute.MOVABLE)) {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.OPEN_GL);
            platformVulkanSurfaceView = new PlatformGLTextureView(context, zContains);
        } else if (zIsAndroidGo || !z12) {
            platformVulkanSurfaceView = null;
        } else {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.VULKAN);
            try {
                platformVulkanSurfaceView = new PlatformVulkanSurfaceView(context, zContains);
            } catch (RuntimeException e12) {
                Logger.error("Failed to create Vulkan view: " + e12.getMessage());
                Logger.error("Falling back to OpenGL view");
            }
        }
        if (platformVulkanSurfaceView == null) {
            GraphicsViewState.logViewCreateAttempt(GraphicsViewType.OPEN_GL);
            platformVulkanSurfaceView = new PlatformGLSurfaceView(context, zContains);
        }
        if (set.contains(Attribute.NONINTERACTIVE)) {
            platformVulkanSurfaceView.setNoninteractive(true);
        }
        return platformVulkanSurfaceView;
    }

    private static boolean isAndroidGo(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }
}
