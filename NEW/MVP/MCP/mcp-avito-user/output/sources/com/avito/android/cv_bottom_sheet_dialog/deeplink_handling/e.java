package com.avito.android.cv_bottom_sheet_dialog.deeplink_handling;

import X41.n;
import Y61.k;
import com.avito.android.cv_bottom_sheet_dialog.deeplink.JobCvBottomSheetLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: CvBottomSheetDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink_handling/e;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_job_cv-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f131587b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f131588a;

    /* compiled from: CvBottomSheetDeeplinkHandlerModule_ProvideDeeplinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cv_bottom_sheet_dialog/deeplink_handling/e$a;", "", "<init>", "()V", "_avito_job_cv-bottom-sheet-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k f fVar) {
            d.f131586a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(JobCvBottomSheetLink.class, new g(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(JobCvBottomSheetLink.class), fVar));
        }

        public a() {
        }
    }

    public e(@k f fVar) {
        this.f131588a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f131587b.getClass();
        return a.a(this.f131588a);
    }
}
