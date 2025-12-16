package org.commonmark.internal;

import Q61.AbstractC14868b;
import Q61.u;

/* compiled from: ListBlockParser.java */
/* loaded from: classes7.dex */
public class p extends R61.a {

    /* renamed from: a, reason: collision with root package name */
    public final Q61.t f420350a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f420351b;

    /* renamed from: c, reason: collision with root package name */
    public int f420352c;

    /* compiled from: ListBlockParser.java */
    public static class a extends R61.b {
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
        @Override // R61.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final org.commonmark.internal.d a(org.commonmark.internal.h r17, R61.g r18) {
            /*
                Method dump skipped, instructions count: 376
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.commonmark.internal.p.a.a(org.commonmark.internal.h, R61.g):org.commonmark.internal.d");
        }
    }

    /* compiled from: ListBlockParser.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Q61.t f420353a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420354b;

        public b(Q61.t tVar, int i12) {
            this.f420353a = tVar;
            this.f420354b = i12;
        }
    }

    /* compiled from: ListBlockParser.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Q61.t f420355a;

        /* renamed from: b, reason: collision with root package name */
        public final int f420356b;

        public c(Q61.t tVar, int i12) {
            this.f420355a = tVar;
            this.f420356b = i12;
        }
    }

    public p(Q61.t tVar) {
        this.f420350a = tVar;
    }

    @Override // R61.a, R61.d
    public final boolean a() {
        return true;
    }

    @Override // R61.d
    public final AbstractC14868b c() {
        return this.f420350a;
    }

    @Override // R61.a, R61.d
    public final boolean e(AbstractC14868b abstractC14868b) {
        if (!(abstractC14868b instanceof u)) {
            return false;
        }
        if (this.f420351b && this.f420352c == 1) {
            this.f420350a.f13499f = false;
            this.f420351b = false;
        }
        return true;
    }

    @Override // R61.d
    public final R61.c g(h hVar) {
        if (hVar.f420287h) {
            this.f420351b = true;
            this.f420352c = 0;
        } else if (this.f420351b) {
            this.f420352c++;
        }
        return R61.c.a(hVar.f420281b);
    }
}
