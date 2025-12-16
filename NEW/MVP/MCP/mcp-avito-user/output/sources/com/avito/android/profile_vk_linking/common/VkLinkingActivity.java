package com.avito.android.profile_vk_linking.common;

import Y61.k;
import Y61.l;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementFragment;
import com.avito.android.profile_vk_linking.linked_group.VkLinkedGroupFragment;
import com.avito.android.profile_vk_linking.start.VkLinkingStartFragment;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: VkLinkingActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/VkLinkingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "ScreenMode", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VkLinkingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public P f230923m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkLinkingActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/VkLinkingActivity$ScreenMode;", "", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ScreenMode {

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ ScreenMode[] f230924c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f230925d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f230926b;

        static {
            ScreenMode[] screenModeArr = {new ScreenMode("START", 0, "vk_linking_start_fragment"), new ScreenMode("GROUP_MANAGEMENT", 1, "vk_linking_group_management_fragment"), new ScreenMode("LINKED", 2, "vk_linked_group_fragment")};
            f230924c = screenModeArr;
            f230925d = kotlin.enums.c.a(screenModeArr);
        }

        public ScreenMode(String str, int i12, String str2) {
            this.f230926b = str2;
        }

        public static ScreenMode valueOf(String str) {
            return (ScreenMode) Enum.valueOf(ScreenMode.class, str);
        }

        public static ScreenMode[] values() {
            return (ScreenMode[]) f230924c.clone();
        }
    }

    /* compiled from: VkLinkingActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ScreenMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ScreenMode[] screenModeArr = ScreenMode.f230924c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ScreenMode[] screenModeArr2 = ScreenMode.f230924c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.profile_vk_linking.common.deep_linking.di.a.a().a((com.avito.android.profile_vk_linking.common.deep_linking.di.h) C29972i.a(C29972i.b(this), com.avito.android.profile_vk_linking.common.deep_linking.di.h.class)).a(this);
    }

    public final void a2(ScreenMode screenMode) {
        Fragment vkLinkingStartFragment;
        int iOrdinal = screenMode.ordinal();
        if (iOrdinal == 0) {
            VkLinkingStartFragment.f231392p0.getClass();
            vkLinkingStartFragment = new VkLinkingStartFragment();
        } else if (iOrdinal == 1) {
            VkLinkingGroupManagementFragment.f231083r0.getClass();
            vkLinkingStartFragment = new VkLinkingGroupManagementFragment();
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            VkLinkedGroupFragment.f231242p0.getClass();
            vkLinkingStartFragment = new VkLinkedGroupFragment();
        }
        H hE2 = getSupportFragmentManager().e();
        hE2.n(R.id.fragment_container, vkLinkingStartFragment, screenMode.f230926b);
        hE2.f();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("key_screen_mode");
            ScreenMode screenModeValueOf = stringExtra != null ? ScreenMode.valueOf(stringExtra) : null;
            if (screenModeValueOf == null) {
                throw new IllegalStateException("Screen mode must be set");
            }
            a2(screenModeValueOf);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("key_screen_mode");
        ScreenMode screenModeValueOf = stringExtra != null ? ScreenMode.valueOf(stringExtra) : null;
        if (screenModeValueOf == null) {
            throw new IllegalStateException("Screen mode must be set");
        }
        Fragment fragment = (Fragment) C42745f0.G(getSupportFragmentManager().P());
        if (screenModeValueOf.f230926b.equals(fragment != null ? fragment.getTag() : null)) {
            return;
        }
        a2(screenModeValueOf);
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void startActivityForResult(@k Intent intent, int i12, @l Bundle bundle) {
        ComponentName component = intent.getComponent();
        if (L.f(component != null ? component.getClassName() : null, VkLinkingActivity.class.getName())) {
            P p12 = this.f230923m;
            if (p12 == null) {
                p12 = null;
            }
            p12.getClass();
            n<Object> nVar = P.f67370w0[66];
            if (!((Boolean) p12.f67396Z.a().invoke()).booleanValue()) {
                onNewIntent(intent);
                onActivityResult(i12, 0, null);
                return;
            }
        }
        super.startActivityForResult(intent, i12, bundle);
    }
}
