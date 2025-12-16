package FX0;

import GX0.a;
import Me.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.camera2.internal.RunnableC20014j;
import androidx.camera.core.processing.k;
import androidx.camera.core.processing.s;
import androidx.concurrent.futures.b;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.graphics.C22771k;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.fragment.app.ActivityC22955m;
import androidx.media3.common.util.r;
import androidx.media3.exoplayer.analytics.b;
import androidx.media3.exoplayer.source.C23171w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.DirectExecutor;
import com.avito.android.app_rater.interactor.o;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs.BottomSheetWithTabsScreenFragment;
import com.avito.android.code_confirmation.code_confirmation.h0;
import com.avito.android.iac_avcalls.public_module.models.AvCallsTerminateReason;
import com.avito.android.photo_picker.converter.BitmapConverter;
import com.avito.android.photo_picker.converter.ImageConvertOptions;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.validation.Structure;
import com.google.android.datatransport.runtime.j;
import com.google.android.exoplayer2.analytics.b;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.util.C36604u;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.my.target.C37802o;
import com.my.target.Z;
import com.my.target.p1;
import com.otaliastudios.transcoder.i;
import e11.AbstractC39858c1;
import e11.F;
import e11.m2;
import i81.InterfaceC41245e;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.C;
import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;
import io.reactivex.rxjava3.core.InterfaceC41780m;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import kotlinx.coroutines.channels.I0;
import oV0.C44695a;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xQ0.k;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements a.InterfaceC0354a, b.c, r.a, InterfaceC41772e, InterfaceC37022e, M, io.reactivex.rxjava3.core.M, C, u, InterfaceC41780m, C36604u.a, C37802o.a, Z.b, F.a, InterfaceC41245e.a, HV0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4733b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4734c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4736e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i12) {
        this.f4733b = i12;
        this.f4734c = obj;
        this.f4735d = obj2;
        this.f4736e = obj3;
    }

    @Override // com.my.target.C37802o.a
    public void a(boolean z12) {
        WeakHashMap<ImageView, com.my.target.common.models.b> weakHashMap = C37802o.f365040c;
        ImageView imageView = (ImageView) ((WeakReference) this.f4734c).get();
        com.my.target.common.models.b bVar = (com.my.target.common.models.b) this.f4735d;
        if (imageView != null) {
            WeakHashMap<ImageView, com.my.target.common.models.b> weakHashMap2 = C37802o.f365040c;
            if (bVar == weakHashMap2.get(imageView)) {
                weakHashMap2.remove(imageView);
                Bitmap bitmapA = bVar.a();
                if (bitmapA != null) {
                    C37802o.a(bitmapA, imageView);
                }
            }
        }
        C37802o.a aVar = (C37802o.a) this.f4736e;
        if (aVar != null) {
            aVar.a(bVar.a() != null);
        }
    }

    @Override // com.my.target.Z.b
    public void c(AbstractC39858c1 abstractC39858c1, String str) {
        p1 p1Var = (p1) this.f4735d;
        Z z12 = (Z) this.f4734c;
        z12.getClass();
        p1Var.b((Context) this.f4736e);
        if (z12.f364679d == null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            m2.d(new com.avito.konveyor.item_visibility_tracker.c(z12, abstractC39858c1, str, 8));
        } else {
            z12.f364679d.c(abstractC39858c1, str);
            z12.f364679d = null;
        }
    }

    @Override // androidx.concurrent.futures.b.c
    public Object d(b.a aVar) {
        switch (this.f4733b) {
            case 1:
                k kVar = (k) this.f4734c;
                kVar.getClass();
                kVar.b(new a(kVar, (androidx.camera.core.F) this.f4735d, (s) this.f4736e, aVar, 1), new RunnableC20014j());
                return "Init GlRenderer";
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                aVar.a(new androidx.work.C(atomicBoolean, 0), DirectExecutor.f55372b);
                ((androidx.work.impl.utils.taskexecutor.a) this.f4734c).execute(new m(atomicBoolean, aVar, (Y41.a) this.f4736e, 10));
                return (String) this.f4735d;
        }
    }

    @Override // HV0.c
    public void dispose() {
        Set set = (Set) ((C44695a) this.f4734c).f419807b.get(this.f4735d);
        if (set != null) {
            set.remove((oV0.e) this.f4736e);
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41772e
    public void e(InterfaceC41770c interfaceC41770c) {
        xQ0.k jVar;
        switch (this.f4733b) {
            case 4:
                ProfileInfo profileInfo = (ProfileInfo) this.f4734c;
                Session session = (Session) this.f4735d;
                com.avito.android.account.M m12 = (com.avito.android.account.M) this.f4736e;
                if (profileInfo != null) {
                    synchronized (m12.f68052g) {
                        ProfileInfo profileInfoE = m12.f68054i;
                        if (profileInfoE == null) {
                            profileInfoE = m12.f68047b.e();
                            m12.f68054i = profileInfoE;
                            m12.f68055j.accept(profileInfoE);
                        }
                        ProfileInfo profileInfoA = m12.f68051f.a(profileInfo, profileInfoE);
                        m12.f68047b.a(profileInfoA);
                        m12.f68054i = profileInfoA;
                        m12.f68048c.setUserId(profileInfoA.getUserId());
                        ProfileInfo profileInfo2 = m12.f68054i;
                        if (profileInfo2 == null) {
                            profileInfo2 = ProfileInfo.INSTANCE.getNULL();
                        }
                        m12.f68055j.accept(profileInfo2);
                        m12.f68050e.getF125491k().getClass();
                        G0 g02 = G0.f406611a;
                    }
                }
                if (session != null) {
                    synchronized (m12.f68052g) {
                        m12.f68050e.getF125491k().getClass();
                        m12.f68053h = session;
                        m12.f68046a.b(session);
                        Session session2 = m12.f68053h;
                        if (session2 == null) {
                            session2 = Session.INSTANCE.getNULL();
                        }
                        m12.f68056k.accept(session2);
                        G0 g03 = G0.f406611a;
                    }
                }
                interfaceC41770c.e();
                return;
            default:
                com.avito.avcalls.android.a aVarA = ((com.avito.android.iac_avcalls.impl_module.platform_v1.d) this.f4734c).f164595a.a();
                AvCallsTerminateReason avCallsTerminateReason = (AvCallsTerminateReason) this.f4736e;
                if (avCallsTerminateReason instanceof AvCallsTerminateReason.AnswerTimeout) {
                    jVar = k.a.f442496b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.Busy) {
                    jVar = k.b.f442497b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.ConnectTimeout) {
                    jVar = k.d.f442498b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.Hangup) {
                    jVar = k.e.f442499b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.InternalError) {
                    jVar = k.f.f442500b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.NoMicAccess) {
                    jVar = k.g.f442501b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.Reject) {
                    jVar = k.h.f442502b;
                } else if (avCallsTerminateReason instanceof AvCallsTerminateReason.ServerError) {
                    jVar = k.i.f442503b;
                } else {
                    if (!(avCallsTerminateReason instanceof AvCallsTerminateReason.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar = new k.j(((AvCallsTerminateReason.Unknown) avCallsTerminateReason).getReason());
                }
                aVarA.h((String) this.f4735d, jVar, new com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.d(interfaceC41770c));
                return;
        }
    }

    @Override // GX0.a.InterfaceC0354a
    public Object execute() {
        c cVar = (c) this.f4734c;
        com.google.android.datatransport.runtime.scheduling.persistence.d dVar = cVar.f4741d;
        j jVar = (j) this.f4736e;
        com.google.android.datatransport.runtime.r rVar = (com.google.android.datatransport.runtime.r) this.f4735d;
        dVar.f6(rVar, jVar);
        cVar.f4738a.b(rVar, 1);
        return null;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(B b12) throws SecurityException, IllegalArgumentException {
        switch (this.f4733b) {
            case 11:
                com.avito.android.floating_views.h hVar = new com.avito.android.floating_views.h(new com.avito.android.map_core.view.pin_items.k((com.avito.android.map_core.view.pin_items.j) this.f4736e, b12), (LinearLayoutManager) this.f4734c);
                RecyclerView recyclerView = (RecyclerView) this.f4735d;
                b12.f(new com.avito.android.map_core.view.pin_items.i(recyclerView, hVar, 0));
                recyclerView.o(hVar);
                break;
            case 12:
            default:
                com.avito.android.photo_picker.converter.c cVar = (com.avito.android.photo_picker.converter.c) this.f4734c;
                try {
                    com.avito.android.photo_picker.converter.a aVarA = new BitmapConverter(cVar.f219316a, (Uri) this.f4735d, (ImageConvertOptions) this.f4736e, cVar.f219317b).a();
                    if (aVarA == null) {
                        b12.onError(new IOException());
                    } else {
                        b12.onNext(aVarA);
                        b12.e();
                    }
                    break;
                } catch (Exception e12) {
                    b12.onError(e12);
                    return;
                }
            case 13:
                Context context = ((com.avito.android.messenger.conversation.mvi.video.c) this.f4736e).f194889b;
                Uri uri = (Uri) this.f4734c;
                String string = uri.toString();
                File file = (File) this.f4735d;
                String string2 = file.toString();
                Integer numY0 = null;
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(context, uri);
                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(20);
                    if (strExtractMetadata != null) {
                        numY0 = C43066x.y0(strExtractMetadata);
                    }
                } catch (Exception unused) {
                }
                com.avito.android.messenger.conversation.mvi.video.a aVar = new com.avito.android.messenger.conversation.mvi.video.a(numY0);
                i.b bVar = new i.b(file.getPath());
                x11.j jVar = new x11.j(context, uri);
                bVar.f365994b.add(jVar);
                bVar.f365995c.add(jVar);
                bVar.f365999g = aVar;
                bVar.f365996d = new com.avito.android.messenger.conversation.mvi.video.d(string, string2, b12, file);
                b12.f(new h0(bVar.a(), 3));
                break;
        }
    }

    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        BottomSheetWithTabsScreenFragment.a aVar = BottomSheetWithTabsScreenFragment.f104203P0;
        C22771k c22771kE = j02.e(1);
        C22771k c22771kE2 = j02.e(2);
        int i12 = c22771kE.f44776b;
        ((Guideline) this.f4734c).setGuidelineBegin(i12);
        ((Guideline) this.f4735d).setGuidelineBegin(i12);
        ((BottomSheetWithTabsScreenFragment) this.f4736e).requireView().setPadding(c22771kE2.f44775a, 0, c22771kE2.f44777c, c22771kE2.f44778d);
        return J0.f44939b;
    }

    @Override // androidx.media3.common.util.r.a
    public void invoke(Object obj) {
        switch (this.f4733b) {
            case 2:
                ((androidx.media3.exoplayer.analytics.b) obj).v((b.C1823b) this.f4734c, (C23171w) this.f4735d, (IOException) this.f4736e);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.b) obj).mt((b.C10568b) this.f4734c, (C36557u) this.f4735d, (IOException) this.f4736e);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        switch (this.f4733b) {
            case 7:
                try {
                    k12.onSuccess(((com.avito.android.evidence_request.details.validation.i) this.f4734c).f148574b.b((List) this.f4735d, (Structure) this.f4736e));
                    return;
                } catch (Throwable th2) {
                    k12.g(th2);
                    return;
                }
            case 8:
                try {
                    k12.onSuccess(((com.avito.android.evidence_request.mvi.domain.evidence_details.C) this.f4734c).f148653b.b((List) this.f4735d, (Structure) this.f4736e));
                    return;
                } catch (Throwable th3) {
                    k12.g(th3);
                    return;
                }
            default:
                com.avito.android.image.enhancement.files.d dVar = (com.avito.android.image.enhancement.files.d) this.f4734c;
                Uri uri = (Uri) this.f4735d;
                File file = (File) this.f4736e;
                try {
                    Response responseExecute = dVar.f169370a.newCall(new Request.Builder().url(uri.toString()).build()).execute();
                    if (!responseExecute.isSuccessful()) {
                        k12.onError(new IOException("Failed to download file: " + responseExecute.code()));
                        return;
                    }
                    ResponseBody responseBodyBody = responseExecute.body();
                    if (responseBodyBody == null) {
                        k12.onError(new IOException("Response body is null"));
                        return;
                    }
                    InputStream inputStreamByteStream = responseBodyBody.byteStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            kotlin.io.b.a(inputStreamByteStream, fileOutputStream, 8192);
                            kotlin.io.c.a(fileOutputStream, null);
                            kotlin.io.c.a(inputStreamByteStream, null);
                            k12.onSuccess(file);
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Exception e12) {
                    k12.onError(e12);
                    return;
                }
        }
    }

    @Override // i81.InterfaceC41245e.a
    public Object newInstance() {
        return ((InterfaceC41245e) this.f4734c).d((Constructor) this.f4735d, (Object[]) this.f4736e);
    }

    @Override // com.google.android.gms.tasks.InterfaceC37022e
    public void onComplete(Task task) {
        boolean zR2 = task.r();
        I0 i02 = (I0) this.f4736e;
        if (!zR2) {
            i02.h(task.m());
            return;
        }
        ReviewInfo reviewInfo = (ReviewInfo) task.n();
        if (reviewInfo != null) {
            ((com.google.android.play.core.review.d) this.f4734c).a((ActivityC22955m) this.f4735d, reviewInfo).c(new o(i02, 0));
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, IOException iOException, boolean z12, int i12) {
        this.f4733b = i12;
        this.f4734c = obj;
        this.f4735d = obj3;
        this.f4736e = iOException;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    @Override // io.reactivex.rxjava3.core.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(io.reactivex.rxjava3.core.s r19) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            java.lang.Object r0 = r1.f4735d
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.Object r3 = r1.f4736e
            r9 = r3
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r1.f4734c
            r10 = r3
            com.avito.android.messenger.conversation.mvi.file_attachment.t r10 = (com.avito.android.messenger.conversation.mvi.file_attachment.t) r10
            android.content.Context r11 = r10.f190737a
            android.content.ContentResolver r3 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L77
            kotlin.C r4 = r10.f190745i     // Catch: java.lang.Throwable -> L77
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L77
            r5 = r4
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L77
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L77
            r4 = 0
            if (r3 == 0) goto L89
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L77
            r5 = r3
            android.database.Cursor r5 = (android.database.Cursor) r5     // Catch: java.lang.Throwable -> L60
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L63
            java.lang.Long r6 = r10.z(r0, r9)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = "_display_name"
            int r7 = r5.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r8 = "_size"
            int r8 = r5.getColumnIndex(r8)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L63
            if (r7 < 0) goto L63
            if (r8 < 0) goto L63
            com.avito.android.messenger.conversation.mvi.file_attachment.z r9 = new com.avito.android.messenger.conversation.mvi.file_attachment.z     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = r5.getString(r7)     // Catch: java.lang.Throwable -> L60
            long r14 = r5.getLong(r8)     // Catch: java.lang.Throwable -> L60
            long r16 = r6.longValue()     // Catch: java.lang.Throwable -> L60
            r12 = r9
            r12.<init>(r13, r14, r16)     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r0 = move-exception
            r4 = r0
            goto L82
        L63:
            r9 = r4
        L64:
            kotlin.io.c.a(r3, r4)     // Catch: java.lang.Throwable -> L77
            if (r9 == 0) goto L89
            android.content.ContentResolver r3 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L77
            java.io.InputStream r0 = r3.openInputStream(r0)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L79
            kotlin.io.c.a(r0, r4)     // Catch: java.lang.Throwable -> L77
            goto L7a
        L77:
            r0 = move-exception
            goto L8f
        L79:
            r9 = r4
        L7a:
            if (r9 == 0) goto L89
            r2.onSuccess(r9)     // Catch: java.lang.Throwable -> L77
            kotlin.G0 r4 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L77
            goto L89
        L82:
            throw r4     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            r5 = r0
            kotlin.io.c.a(r3, r4)     // Catch: java.lang.Throwable -> L77
            throw r5     // Catch: java.lang.Throwable -> L77
        L89:
            if (r4 != 0) goto L92
            r19.e()     // Catch: java.lang.Throwable -> L77
            goto L92
        L8f:
            r2.onError(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: FX0.b.a(io.reactivex.rxjava3.core.s):void");
    }
}
