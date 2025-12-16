package uv;

import Y61.l;
import android.os.Bundle;
import com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3.AppliesCreateV3Response;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AppliesCreateResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Luv/a;", "Luv/b;", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/AppliesCreateV3Response;", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49116a implements InterfaceC49117b<AppliesCreateV3Response> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Bundle f440324a;

    /* compiled from: AppliesCreateResponseConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uv.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12735a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f440325a;

        static {
            int[] iArr = new int[AppliesCreateV3Response.Action.values().length];
            try {
                iArr[AppliesCreateV3Response.Action.CanApply.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppliesCreateV3Response.Action.OpenChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppliesCreateV3Response.Action.ShowChooseOrCreateCvScreen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppliesCreateV3Response.Action.ShowQuickApplyForm.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppliesCreateV3Response.Action.ShowDefaultCreateCvScreen.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppliesCreateV3Response.Action.NeedCv.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AppliesCreateV3Response.Action.ShowEnrichmentScreen.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f440325a = iArr;
        }
    }

    public C49116a(@l Bundle bundle) {
        this.f440324a = bundle;
    }
}
