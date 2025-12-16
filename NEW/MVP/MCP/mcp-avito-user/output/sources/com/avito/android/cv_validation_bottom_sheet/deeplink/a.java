package com.avito.android.cv_validation_bottom_sheet.deeplink;

import Ju.InterfaceC14249c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheet;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetOpenParams;
import com.avito.android.cv_validation_bottom_sheet.ui.CvValidationBottomSheetResult;
import com.avito.android.cv_validation_need_draft.deeplink.CvNeedDraftLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.o;
import l41.r;
import rv.C47919b;

/* compiled from: CvValidationDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/deeplink/a;", "Lev/a;", "Lcom/avito/android/cv_validation_bottom_sheet/deeplink/CvValidationLink;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<CvValidationLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f131803f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f131804g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.i f131805h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f131806i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CvValidationDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "accept", "(Lrv/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.cv_validation_bottom_sheet.deeplink.a$a, reason: collision with other inner class name */
    public static final class C3944a<T> implements l41.g {
        public C3944a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            int i12 = Build.VERSION.SDK_INT;
            Bundle bundle = ((C47919b) obj).f437159b;
            CvValidationBottomSheetResult cvValidationBottomSheetResult = (CvValidationBottomSheetResult) (i12 >= 34 ? (Parcelable) bundle.getParcelable("CV_VALIDATION_BOTTOM_SHEET_RESULT_KEY", CvValidationBottomSheetResult.class) : bundle.getParcelable("CV_VALIDATION_BOTTOM_SHEET_RESULT_KEY"));
            a.this.j(cvValidationBottomSheetResult instanceof CvValidationBottomSheetResult.OpenMessenger ? new CvValidationLink.b.C3943b(((CvValidationBottomSheetResult.OpenMessenger) cvValidationBottomSheetResult).f131954b) : CvValidationLink.b.a.f131798b);
        }
    }

    /* compiled from: CvValidationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "LJu/c;", "apply", "(Lkv/a;)LJu/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f131808b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return ((C43501a) obj).f413261b;
        }
    }

    /* compiled from: CvValidationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJu/c;", "it", "", "test", "(LJu/c;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f131809b = new c<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((InterfaceC14249c) obj) instanceof CvNeedDraftLink.b.a;
        }
    }

    /* compiled from: CvValidationDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJu/c;", "it", "Lkotlin/G0;", "accept", "(LJu/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a aVar = a.this;
            a.i.C4057a.d(aVar.f131805h, com.avito.android.printable_text.b.c(R.string.cv_validation_default_error_message, new Serializable[0]), null, null, new f.c(new IllegalStateException(((CvNeedDraftLink.b.a) ((InterfaceC14249c) obj)).f131957b)), 0, null, null, null, 2030);
        }
    }

    @Inject
    public a(@Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k a.i iVar) {
        this.f131803f = dVar;
        this.f131804g = fVar;
        this.f131805h = iVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CvValidationLink cvValidationLink = (CvValidationLink) deepLink;
        CvValidationTexts cvValidationTexts = cvValidationLink.f131795d;
        String str2 = cvValidationTexts.f131800b;
        CvValidationButton cvValidationButton = cvValidationLink.f131794c;
        CvValidationBottomSheetOpenParams cvValidationBottomSheetOpenParams = new CvValidationBottomSheetOpenParams(cvValidationLink.f131793b, str2, cvValidationTexts.f131801c, cvValidationTexts.f131802d, cvValidationButton.f131791b, cvValidationButton.f131792c, cvValidationLink.f131796e, cvValidationLink.f131797f);
        CvValidationBottomSheet.f131925r0.getClass();
        CvValidationBottomSheet cvValidationBottomSheet = new CvValidationBottomSheet();
        cvValidationBottomSheet.f131933n0.setValue(cvValidationBottomSheet, CvValidationBottomSheet.f131926s0[0], cvValidationBottomSheetOpenParams);
        this.f131803f.w1(cvValidationBottomSheet, this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f131804g.l1("CV_VALIDATION_BOTTOM_SHEET_REQUEST_KEY").t0(new C3944a());
        io.reactivex.rxjava3.disposables.c cVar = this.f131806i;
        cVar.b(dVarT0);
        cVar.b(this.f395447e.d0(b.f131808b).N(c.f131809b).t0(new d()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f131806i.e();
    }
}
