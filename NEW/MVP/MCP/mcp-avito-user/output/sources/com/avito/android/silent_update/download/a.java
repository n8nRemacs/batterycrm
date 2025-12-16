package com.avito.android.silent_update.download;

import Bw0.AbstractC13196a;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.permissions.u;
import com.avito.android.remote.C34390u;
import com.avito.android.util.C;
import com.avito.android.util.R0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DownloadUpdateTaskImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/download/a;", "LBw0/a;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends AbstractC13196a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34390u f283641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.config.b f283642b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C f283643c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e f283644d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Cw0.e f283645e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u f283646f;

    /* compiled from: DownloadUpdateTaskImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.silent_update.download.DownloadUpdateTaskImpl", f = "DownloadUpdateTaskImpl.kt", i = {0, 0, 0}, l = {33}, m = "suspendedStart", n = {"this", "sourceScreen", "configId"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.avito.android.silent_update.download.a$a, reason: collision with other inner class name */
    public static final class C8457a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f283647q;

        /* renamed from: r, reason: collision with root package name */
        public String f283648r;

        /* renamed from: s, reason: collision with root package name */
        public String f283649s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f283650t;

        /* renamed from: v, reason: collision with root package name */
        public int f283652v;

        public C8457a(Continuation<? super C8457a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f283650t = obj;
            this.f283652v |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.suspendedStart(null, this);
        }
    }

    public a(@Y61.k R0 r02, @Y61.k C34390u c34390u, @Y61.k com.avito.android.remote.config.b bVar, @Y61.k C c12, @Y61.k e eVar, @Y61.k Cw0.e eVar2, @Y61.k u uVar) {
        super(r02.a());
        this.f283641a = c34390u;
        this.f283642b = bVar;
        this.f283643c = c12;
        this.f283644d = eVar;
        this.f283645e = eVar2;
        this.f283646f = uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:23:0x005d, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:40:0x009e, B:42:0x00a7, B:44:0x00b1, B:48:0x00bd, B:50:0x00cd, B:52:0x00d0, B:54:0x00d9, B:56:0x00e2, B:55:0x00dd, B:32:0x007f, B:34:0x0094), top: B:66:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:23:0x005d, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:40:0x009e, B:42:0x00a7, B:44:0x00b1, B:48:0x00bd, B:50:0x00cd, B:52:0x00d0, B:54:0x00d9, B:56:0x00e2, B:55:0x00dd, B:32:0x007f, B:34:0x0094), top: B:66:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:12:0x002b, B:23:0x005d, B:25:0x0063, B:27:0x006c, B:29:0x0070, B:40:0x009e, B:42:0x00a7, B:44:0x00b1, B:48:0x00bd, B:50:0x00cd, B:52:0x00d0, B:54:0x00d9, B:56:0x00e2, B:55:0x00dd, B:32:0x007f, B:34:0x0094), top: B:66:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.service.short_task.n
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object suspendedStart(@Y61.k android.os.Bundle r11, @Y61.k kotlin.coroutines.Continuation<? super com.avito.android.service.short_task.ShortTask.Status> r12) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.silent_update.download.a.suspendedStart(android.os.Bundle, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
