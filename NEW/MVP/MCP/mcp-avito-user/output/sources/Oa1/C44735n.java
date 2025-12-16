package oa1;

import Y41.p;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* renamed from: oa1.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44735n extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f419928q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f419929r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C44736o f419930s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bitmap f419931t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f419932u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44735n(C44736o c44736o, Bitmap bitmap, Context context, Continuation continuation) {
        super(2, continuation);
        this.f419930s = c44736o;
        this.f419931t = bitmap;
        this.f419932u = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C44735n c44735n = new C44735n(this.f419930s, this.f419931t, this.f419932u, continuation);
        c44735n.f419929r = obj;
        return c44735n;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C44735n) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa1.C44735n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
