package com.avito.android.autoteka.presentation.report;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import androidx.core.content.FileProvider;
import androidx.view.C22977J;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.K;

/* compiled from: AutotekaReportActivity.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.report.AutotekaReportActivity$savePdfToFile$1", f = "AutotekaReportActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Context f97693q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f97694r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InputStream f97695s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AutotekaReportActivity f97696t;

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.report.AutotekaReportActivity$savePdfToFile$1$2$1", f = "AutotekaReportActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.autoteka.presentation.report.a$a, reason: collision with other inner class name */
    public static final class C2918a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AutotekaReportActivity f97697q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2918a(AutotekaReportActivity autotekaReportActivity, Continuation<? super C2918a> continuation) {
            super(2, continuation);
            this.f97697q = autotekaReportActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C2918a(this.f97697q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C2918a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            L5.a(this.f97697q, R.string.autoteka_try_again_for_toast, 0);
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaReportActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.report.AutotekaReportActivity$savePdfToFile$1$3", f = "AutotekaReportActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ AutotekaReportActivity f97698q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AutotekaReportActivity autotekaReportActivity, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f97698q = autotekaReportActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f97698q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            AutotekaReportActivity autotekaReportActivity = this.f97698q;
            L5.b(autotekaReportActivity, autotekaReportActivity.getString(R.string.autoteka_try_again_for_toast), 0);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, InputStream inputStream, AutotekaReportActivity autotekaReportActivity, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f97693q = context;
        this.f97694r = str;
        this.f97695s = inputStream;
        this.f97696t = autotekaReportActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f97693q, this.f97694r, this.f97695s, this.f97696t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) throws IOException {
        InputStream inputStream = this.f97695s;
        Context context = this.f97693q;
        AutotekaReportActivity autotekaReportActivity = this.f97696t;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        try {
            File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), this.f97694r + ".pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            l0.f fVar = new l0.f();
            while (true) {
                int i12 = inputStream.read(bArr);
                fVar.f406840b = i12;
                if (i12 == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, i12);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            inputStream.close();
            Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", file);
            InterfaceC35845m2 interfaceC35845m2 = autotekaReportActivity.f97677r;
            if (interfaceC35845m2 == null) {
                interfaceC35845m2 = null;
            }
            try {
                autotekaReportActivity.startActivity(interfaceC35845m2.m(uriForFile, "application/pdf"));
            } catch (Exception unused) {
                C22977J c22977jA = C22981N.a(autotekaReportActivity.getLifecycle());
                kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
                C43259k.d(c22977jA, K.f411877a, null, new C2918a(autotekaReportActivity, null), 2);
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            C22977J c22977jA2 = C22984Q.a(autotekaReportActivity);
            kotlinx.coroutines.scheduling.c cVar2 = C43262l0.f411945a;
            C43259k.d(c22977jA2, K.f411877a, null, new b(autotekaReportActivity, null), 2);
        }
        return G0.f406611a;
    }
}
