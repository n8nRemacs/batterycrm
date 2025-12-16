package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class vkb extends EdgeEffect {
    public m8f a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wkb c;
    public final /* synthetic */ RecyclerView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkb(int i, wkb wkbVar, RecyclerView recyclerView, Context context) {
        super(context);
        this.b = i;
        this.c = wkbVar;
        this.d = recyclerView;
    }

    public final m8f a() {
        m8f m8fVar = new m8f(this.d, m8f.q);
        n8f n8fVar = new n8f();
        n8fVar.i = 0.0f;
        n8fVar.a(1.0f);
        n8fVar.b(200.0f);
        m8fVar.m = n8fVar;
        return m8fVar;
    }

    public final void b(float f) {
        int i = this.b == 3 ? -1 : 1;
        float f2 = i * r1.a * f * this.c.b;
        RecyclerView recyclerView = this.d;
        recyclerView.setTranslationY(recyclerView.getTranslationY() + f2);
        m8f m8fVar = this.a;
        if (m8fVar != null) {
            m8fVar.b();
        }
    }

    @Override // android.widget.EdgeEffect
    public final boolean draw(Canvas canvas) {
        return false;
    }

    @Override // android.widget.EdgeEffect
    public final boolean isFinished() {
        m8f m8fVar = this.a;
        return m8fVar == null || !m8fVar.f;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i) {
        super.onAbsorb(i);
        float f = (this.b == 3 ? -1 : 1) * i * this.c.c;
        m8f m8fVar = this.a;
        if (m8fVar != null) {
            m8fVar.b();
        }
        m8f m8fVarA = a();
        m8fVarA.a = f;
        m8fVarA.g();
        this.a = m8fVarA;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f) {
        super.onPull(f);
        b(f);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        super.onRelease();
        if (this.d.getTranslationY() == 0.0f) {
            return;
        }
        m8f m8fVarA = a();
        m8fVarA.g();
        this.a = m8fVarA;
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f, float f2) {
        super.onPull(f, f2);
        b(f);
    }
}
