package b61;

import androidx.compose.runtime.C22026a;
import c61.AbstractC26949b;
import c61.C26950c;
import java.util.ArrayList;

/* compiled from: SignatureRemapper.java */
/* loaded from: classes7.dex */
public class i extends AbstractC26949b {

    /* renamed from: a, reason: collision with root package name */
    public final C26950c f56930a;

    /* renamed from: b, reason: collision with root package name */
    public final h f56931b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f56932c = new ArrayList<>();

    public i(C26950c c26950c, h hVar) {
        this.f56930a = c26950c;
        this.f56931b = hVar;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b b() {
        this.f56930a.b();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void c(char c12) {
        this.f56930a.c(c12);
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b d() {
        this.f56930a.getClass();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void e(String str) {
        this.f56932c.add(str);
        this.f56930a.e(this.f56931b.i(str));
    }

    @Override // c61.AbstractC26949b
    public final void f() {
        this.f56930a.f();
        C22026a.e(1, this.f56932c);
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b g() {
        this.f56930a.g();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void h(String str) {
        this.f56930a.h(str);
    }

    @Override // c61.AbstractC26949b
    public final void i(String str) {
        ArrayList<String> arrayList = this.f56932c;
        String str2 = (String) C22026a.b(1, arrayList);
        String str3 = str2 + '$' + str;
        arrayList.add(str3);
        StringBuilder sb2 = new StringBuilder();
        h hVar = this.f56931b;
        sb2.append(hVar.i(str2));
        sb2.append('$');
        String string = sb2.toString();
        String strI = hVar.i(str3);
        this.f56930a.i(strI.substring(strI.startsWith(string) ? string.length() : strI.lastIndexOf(36) + 1));
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b j() {
        this.f56930a.getClass();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b k() {
        this.f56930a.k();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b l() {
        this.f56930a.l();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b m() {
        this.f56930a.m();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b n() {
        this.f56930a.r();
        return this;
    }

    @Override // c61.AbstractC26949b
    public final AbstractC26949b o(char c12) {
        this.f56930a.o(c12);
        return this;
    }

    @Override // c61.AbstractC26949b
    public final void p() {
        this.f56930a.p();
    }

    @Override // c61.AbstractC26949b
    public final void q(String str) {
        this.f56930a.q(str);
    }
}
