package defpackage;

import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.exoplayer.ExoPlaybackException;
import ru.ok.tamtam.animoji.views.AnimojiTextView;

/* loaded from: classes2.dex */
public final class sk implements ew8, fw8 {
    public Object X;
    public Object Y;
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object o;

    public /* synthetic */ sk() {
        this.a = 3;
    }

    @Override // defpackage.fw8
    public void J(c3c c3cVar) {
        fw8 fw8Var = (fw8) this.Y;
        if (fw8Var != null) {
            fw8Var.J(c3cVar);
            c3cVar = ((fw8) this.Y).mo25c();
        }
        ((m69) this.d).J(c3cVar);
    }

    @Override // defpackage.fw8
    public boolean M() {
        if (this.b) {
            ((m69) this.d).getClass();
            return false;
        }
        fw8 fw8Var = (fw8) this.Y;
        fw8Var.getClass();
        return fw8Var.M();
    }

    public ltb a() {
        ltb ltbVar = new ltb();
        ltbVar.a = (CharSequence) this.d;
        ltbVar.b = (IconCompat) this.o;
        ltbVar.c = (String) this.X;
        ltbVar.d = (String) this.Y;
        ltbVar.e = this.b;
        ltbVar.f = this.c;
        return ltbVar;
    }

    public void b(tk0 tk0Var) throws ExoPlaybackException {
        fw8 fw8Var;
        fw8 fw8VarG = tk0Var.g();
        if (fw8VarG == null || fw8VarG == (fw8Var = (fw8) this.Y)) {
            return;
        }
        if (fw8Var != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.Y = fw8VarG;
        this.X = tk0Var;
        fw8VarG.J((c3c) ((m69) this.d).X);
    }

    @Override // defpackage.ew8
    public b3c c() {
        ew8 ew8Var = (ew8) this.Y;
        return ew8Var != null ? ew8Var.c() : (b3c) ((m69) this.d).X;
    }

    @Override // defpackage.ew8
    public long r() {
        switch (this.a) {
            case 1:
                if (this.b) {
                    return ((m69) this.d).r();
                }
                ew8 ew8Var = (ew8) this.Y;
                ew8Var.getClass();
                return ew8Var.r();
            default:
                if (this.b) {
                    return ((m69) this.d).r();
                }
                fw8 fw8Var = (fw8) this.Y;
                fw8Var.getClass();
                return fw8Var.r();
        }
    }

    @Override // defpackage.ew8
    public void s(b3c b3cVar) {
        ew8 ew8Var = (ew8) this.Y;
        if (ew8Var != null) {
            ew8Var.s(b3cVar);
            b3cVar = ((ew8) this.Y).c();
        }
        ((m69) this.d).s(b3cVar);
    }

    public sk(AnimojiTextView animojiTextView, qk qkVar, k kVar) {
        this.a = 0;
        this.d = animojiTextView;
        this.o = qkVar;
        this.X = kVar;
        animojiTextView.addOnAttachStateChangeListener(new rk(0, this));
    }

    @Override // defpackage.fw8
    /* renamed from: c */
    public c3c mo25c() {
        fw8 fw8Var = (fw8) this.Y;
        if (fw8Var != null) {
            return fw8Var.mo25c();
        }
        return (c3c) ((m69) this.d).X;
    }

    public sk(rm5 rm5Var, kwf kwfVar) {
        this.a = 1;
        this.o = rm5Var;
        this.d = new m69(kwfVar);
        this.b = true;
    }

    public sk(sm5 sm5Var, mwf mwfVar) {
        this.a = 2;
        this.o = sm5Var;
        this.d = new m69(mwfVar);
        this.b = true;
    }

    public sk(Context context, f4h f4hVar) {
        this.a = 4;
        this.d = context.getApplicationContext();
        this.o = f4hVar;
        this.Y = mwf.a;
    }
}
