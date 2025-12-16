package com.avito.android.re_agent_landing.landing.mvi.builder;

import Oh0.k;
import com.avito.android.re_agent_landing.generated.api.get_agent_profile_landing_api.Action;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;

/* compiled from: ReAgentProfileCreateLandingItemListBuilder.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_re-agent-landing_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* compiled from: ReAgentProfileCreateLandingItemListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f250812a;

        static {
            int[] iArr = new int[Action.Status.values().length];
            try {
                iArr[Action.Status.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Action.Status.Verification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Action.Status.ProfileExists.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Action.Status.Error.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f250812a = iArr;
        }
    }

    public static final UniversalImage a(k kVar) {
        return new UniversalImage(kVar.getValue(), kVar.getValueDark());
    }
}
