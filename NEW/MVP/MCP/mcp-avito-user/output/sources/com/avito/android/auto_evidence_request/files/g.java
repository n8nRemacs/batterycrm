package com.avito.android.auto_evidence_request.files;

import Ce.InterfaceC13295c;
import Y61.l;
import android.net.Uri;
import com.avito.android.account.G;
import com.avito.android.auto_evidence_request.di.n;
import com.avito.android.photo_cache.PhotoUpload;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_picker.b0;
import com.avito.android.remote.C34384q0;
import com.avito.android.remote.K;
import com.avito.android.remote.ModerationEvidence;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.remote.model.ErrorType;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.confirmation.EvidenceConfirmationBody;
import com.avito.android.remote.model.confirmation.EvidenceConfirmationResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.completable.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import l41.o;

/* compiled from: AutoEvidenceRequestFilesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/files/g;", "Lcom/avito/android/auto_evidence_request/files/f;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f95122a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f95123b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f95124c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b0 f95125d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.j f95126e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_cache.b f95127f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final K f95128g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f95129h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final G f95130i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public y f95131j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public y f95132k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public m f95133l;

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/photo_cache/PhotoUpload;", "it", "Lcom/avito/android/remote/model/CloseableDataSource;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f95134b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return Y.a((CloseableDataSource) obj);
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_cache/PhotoUpload;", "photoList", "Lcom/avito/android/photo_list_view/G;", "apply", "(Ljava/util/List;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {
        public b() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            InterfaceC33208b.InterfaceC6540b c6541b;
            List<PhotoUpload> list = (List) obj;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (PhotoUpload photoUpload : list) {
                g.this.getClass();
                String str = photoUpload.f216304f;
                if (str == null || str.length() == 0) {
                    ErrorType.NoError noError = ErrorType.NoError.INSTANCE;
                    ErrorType errorType = photoUpload.f216307i;
                    if (L.f(errorType, noError)) {
                        c6541b = InterfaceC33208b.InterfaceC6540b.c.f218119a;
                    } else {
                        if (!L.f(errorType, ErrorType.RestorableError.INSTANCE) && !L.f(errorType, ErrorType.NonRestorableError.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c6541b = new InterfaceC33208b.InterfaceC6540b.C6541b(true);
                    }
                } else {
                    c6541b = InterfaceC33208b.InterfaceC6540b.a.f218117a;
                }
                InterfaceC33208b.InterfaceC6540b interfaceC6540b = c6541b;
                String strValueOf = String.valueOf(photoUpload.f216300b);
                String str2 = photoUpload.f216304f;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new com.avito.android.photo_list_view.G(strValueOf, photoUpload.f216305g, interfaceC6540b, null, str2, null, null, false, null, 488, null));
            }
            return arrayList;
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "it", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "apply", "(Ljava/util/List;)Landroid/net/Uri;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f95136b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Uri uri;
            com.avito.android.photo_list_view.G g12 = (com.avito.android.photo_list_view.G) C42745f0.G((List) obj);
            return (g12 == null || (uri = g12.f218069b) == null) ? Uri.EMPTY : uri;
        }
    }

    @Inject
    public g(@n @Y61.k String str, @Y61.k @com.avito.android.auto_evidence_request.di.o String str2, @com.avito.android.auto_evidence_request.di.m @Y61.k String str3, @Y61.k b0 b0Var, @Y61.k com.avito.android.photo_cache.j jVar, @Y61.k com.avito.android.photo_cache.b bVar, @Y61.k K k12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k G g12) {
        this.f95122a = str;
        this.f95123b = str2;
        this.f95124c = str3;
        this.f95125d = b0Var;
        this.f95126e = jVar;
        this.f95127f = bVar;
        this.f95128g = k12;
        this.f95129h = interfaceC35745a5;
        this.f95130i = g12;
    }

    @Override // com.avito.android.auto_evidence_request.files.f
    @Y61.k
    public final InterfaceC43160i<InterfaceC13295c> a(@l AttributedText attributedText) {
        G g12 = this.f95130i;
        String name = g12.e().getName();
        String email = g12.e().getEmail();
        EvidenceConfirmationBody evidenceConfirmationBody = EvidenceConfirmationBody.INSTANCE;
        Map<String, String> mapC = P0.c();
        ModerationEvidence moderationEvidenceA = C34384q0.a(this.f95123b);
        I<TypedResult<EvidenceConfirmationResult>> iD2 = this.f95128g.d(evidenceConfirmationBody.build(this.f95122a, this.f95124c, "sts", name, email, mapC, moderationEvidenceA));
        InterfaceC35745a5 interfaceC35745a5 = this.f95129h;
        return C43175k.d(new i(this, iD2.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()), attributedText, null));
    }

    @Override // com.avito.android.auto_evidence_request.files.f
    public final void b() {
        b0.a.a(this.f95125d, null, 3);
    }

    @Override // com.avito.android.auto_evidence_request.files.f
    @Y61.k
    public final C43210w c(@l AttributedText attributedText, @Y61.k String str, @Y61.k String str2) {
        new v(this.f95128g.e(this.f95122a, str).z(this.f95129h.a())).r().u();
        return new C43210w(new InterfaceC13295c.f(attributedText, str2));
    }

    @Override // com.avito.android.auto_evidence_request.files.f
    @Y61.k
    public final InterfaceC43160i<InterfaceC13295c> d(@Y61.k String str, @l String str2, @l String str3) {
        return C43175k.d(new h(this, this.f95127f.a(this.f95122a).d0(a.f95134b).d0(new b()).d0(c.f95136b), str, str2, str3, null));
    }

    @Override // com.avito.android.auto_evidence_request.files.f
    public final void e(@l Long l12) {
        com.avito.android.photo_cache.b bVar = this.f95127f;
        if (l12 != null) {
            bVar.b(l12.toString());
        } else {
            bVar.d("auto evidence files");
        }
    }

    @Override // com.avito.android.auto_evidence_request.files.f
    @Y61.k
    public final InterfaceC43160i<InterfaceC13295c> f(@Y61.k String str) {
        return C43175k.d(new j(this, this.f95126e.b(), str, null));
    }
}
