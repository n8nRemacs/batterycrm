package tu;

import Y61.k;
import Y61.l;
import android.content.ContentValues;
import androidx.compose.ui.graphics.colorspace.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: PhotoContentValues.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltu/a;", "", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48718a {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f439627n;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContentValues f439628a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439629b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439630c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439631d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439632e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439633f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439634g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439635h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439636i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439637j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439638k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439639l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.android.db.c f439640m;

    static {
        Y y12 = new Y(C48718a.class, "typeId", "getTypeId()Ljava/lang/String;", 0);
        n0 n0Var = m0.f406844a;
        f439627n = new n[]{n0Var.e(y12), e.s(C48718a.class, "operationId", "getOperationId()Ljava/lang/String;", 0, n0Var), e.s(C48718a.class, "position", "getPosition()Ljava/lang/Integer;", 0, n0Var), e.s(C48718a.class, "created", "getCreated()Ljava/lang/Long;", 0, n0Var), e.s(C48718a.class, "uploadId", "getUploadId()Ljava/lang/String;", 0, n0Var), e.s(C48718a.class, "contentUri", "getContentUri()Ljava/lang/String;", 0, n0Var), e.s(C48718a.class, "sourceCode", "getSourceCode()Ljava/lang/Integer;", 0, n0Var), e.s(C48718a.class, "errorCode", "getErrorCode()Ljava/lang/Integer;", 0, n0Var), e.s(C48718a.class, "sourceUri", "getSourceUri()Ljava/lang/String;", 0, n0Var), e.s(C48718a.class, "originalUploadId", "getOriginalUploadId()Ljava/lang/String;", 0, n0Var), e.s(C48718a.class, "originalUri", "getOriginalUri()Ljava/lang/String;", 0, n0Var), e.s(C48718a.class, "enhanceState", "getEnhanceState()Ljava/lang/Integer;", 0, n0Var)};
    }

    public C48718a() {
        this(null, 1, null);
    }

    public final <T> com.avito.android.db.c<T> a(String str) {
        return new com.avito.android.db.c<>(this.f439628a, str);
    }

    public final void b(@l Integer num) {
        this.f439631d.setValue(this, f439627n[2], num);
    }

    public C48718a(ContentValues contentValues, int i12, C42822w c42822w) {
        this.f439628a = (i12 & 1) != 0 ? new ContentValues() : contentValues;
        this.f439629b = a(b.f439643c);
        this.f439630c = a(b.f439644d);
        this.f439631d = a(b.f439645e);
        this.f439632e = a(b.f439646f);
        this.f439633f = a(b.f439647g);
        this.f439634g = a(b.f439648h);
        this.f439635h = a(b.f439649i);
        this.f439636i = a(b.f439650j);
        this.f439637j = a(b.f439651k);
        this.f439638k = a(b.f439652l);
        this.f439639l = a(b.f439653m);
        this.f439640m = a(b.f439654n);
    }
}
