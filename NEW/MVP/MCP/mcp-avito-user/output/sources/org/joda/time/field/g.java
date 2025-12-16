package org.joda.time.field;

import androidx.compose.runtime.C22026a;
import java.io.Serializable;
import java.util.Locale;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.AbstractC44871m;

/* compiled from: DelegatedDateTimeField.java */
/* loaded from: classes7.dex */
public class g extends AbstractC44864f implements Serializable {
    private static final long serialVersionUID = -4730164440214502503L;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC44864f f420693b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC44871m f420694c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC44865g f420695d;

    public g(AbstractC44864f abstractC44864f, AbstractC44871m abstractC44871m, AbstractC44865g abstractC44865g) {
        if (abstractC44864f == null) {
            throw new IllegalArgumentException("The field must not be null");
        }
        this.f420693b = abstractC44864f;
        this.f420694c = abstractC44871m;
        this.f420695d = abstractC44865g == null ? abstractC44864f.y() : abstractC44865g;
    }

    @Override // org.joda.time.AbstractC44864f
    public boolean A() {
        return this.f420693b.A();
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean B() {
        return this.f420693b.B();
    }

    @Override // org.joda.time.AbstractC44864f
    public final long C(long j12) {
        return this.f420693b.C(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long E(long j12) {
        return this.f420693b.E(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long F(long j12) {
        return this.f420693b.F(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public long G(int i12, long j12) {
        return this.f420693b.G(i12, j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long H(long j12, String str, Locale locale) {
        return this.f420693b.H(j12, str, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long a(int i12, long j12) {
        return this.f420693b.a(i12, j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final long b(long j12, long j13) {
        return this.f420693b.b(j12, j13);
    }

    @Override // org.joda.time.AbstractC44864f
    public int c(long j12) {
        return this.f420693b.c(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String d(int i12, Locale locale) {
        return this.f420693b.d(i12, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String e(long j12, Locale locale) {
        return this.f420693b.e(j12, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String f(org.joda.time.base.e eVar, Locale locale) {
        return this.f420693b.f(eVar, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String g(int i12, Locale locale) {
        return this.f420693b.g(i12, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String h(long j12, Locale locale) {
        return this.f420693b.h(j12, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String i(org.joda.time.base.e eVar, Locale locale) {
        return this.f420693b.i(eVar, locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m k() {
        return this.f420693b.k();
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m l() {
        return this.f420693b.l();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int m(Locale locale) {
        return this.f420693b.m(locale);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int n() {
        return this.f420693b.n();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int o(long j12) {
        return this.f420693b.o(j12);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int p(org.joda.time.base.k kVar) {
        return this.f420693b.p(kVar);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int q(org.joda.time.base.k kVar, int[] iArr) {
        return this.f420693b.q(kVar, iArr);
    }

    @Override // org.joda.time.AbstractC44864f
    public int s() {
        return this.f420693b.s();
    }

    @Override // org.joda.time.AbstractC44864f
    public final int t(long j12) {
        return this.f420693b.t(j12);
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("DateTimeField["), this.f420695d.f420904b, ']');
    }

    @Override // org.joda.time.AbstractC44864f
    public final int u(org.joda.time.base.k kVar) {
        return this.f420693b.u(kVar);
    }

    @Override // org.joda.time.AbstractC44864f
    public final int v(org.joda.time.base.k kVar, int[] iArr) {
        return this.f420693b.v(kVar, iArr);
    }

    @Override // org.joda.time.AbstractC44864f
    public final String w() {
        return this.f420695d.f420904b;
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44871m x() {
        AbstractC44871m abstractC44871m = this.f420694c;
        return abstractC44871m != null ? abstractC44871m : this.f420693b.x();
    }

    @Override // org.joda.time.AbstractC44864f
    public final AbstractC44865g y() {
        return this.f420695d;
    }

    @Override // org.joda.time.AbstractC44864f
    public final boolean z(long j12) {
        return this.f420693b.z(j12);
    }
}
