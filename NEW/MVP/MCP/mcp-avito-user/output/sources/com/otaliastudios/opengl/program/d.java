package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import com.otaliastudios.opengl.draw.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GlProgram.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f365938l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f365939m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float[] f365940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, h hVar, float[] fArr) {
        super(0);
        this.f365938l = cVar;
        this.f365939m = hVar;
        this.f365940n = fArr;
    }

    @Override // Y41.a
    public final G0 invoke() {
        float[] fArr = this.f365940n;
        c cVar = this.f365938l;
        h hVar = this.f365939m;
        cVar.d(hVar, fArr);
        hVar.getClass();
        com.otaliastudios.opengl.core.f.b("glDrawArrays start");
        GLES20.glDrawArrays(q11.g.f428980d, 0, hVar.getF365928d().limit() / hVar.getF365918c());
        com.otaliastudios.opengl.core.f.b("glDrawArrays end");
        cVar.c();
        return G0.f406611a;
    }
}
