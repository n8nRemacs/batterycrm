package com.avito.android.profile_vk_linking.start.mvi;

import com.avito.android.profile_vk_linking.generated.api.profile_vk_linking_api.ButtonWithAction;
import com.avito.android.profile_vk_linking.generated.api.profile_vk_linking_api.ButtonWithDeeplink;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VkLinkingModelConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_vk_linking/start/mvi/a;", "", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: VkLinkingModelConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_vk_linking.start.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C7050a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231447a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f231448b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f231449c;

        static {
            int[] iArr = new int[ButtonWithDeeplink.Type.values().length];
            try {
                iArr[ButtonWithDeeplink.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonWithDeeplink.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f231447a = iArr;
            int[] iArr2 = new int[ButtonWithAction.Action.values().length];
            try {
                iArr2[ButtonWithAction.Action.Finish.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ButtonWithAction.Action.Unlink.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonWithAction.Action.Link.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonWithAction.Action.Next.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonWithAction.Action.Reload.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f231448b = iArr2;
            int[] iArr3 = new int[ButtonWithAction.Type.values().length];
            try {
                iArr3[ButtonWithAction.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ButtonWithAction.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f231449c = iArr3;
        }
    }

    @Inject
    public a() {
    }
}
