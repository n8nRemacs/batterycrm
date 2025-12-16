package com.avito.android.cyclic_gallery_widget;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* compiled from: GalleryBadgeDecoration.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/GalleryBadgeDecoration;", "Landroidx/recyclerview/widget/RecyclerView$l;", "DecorationGravity", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryBadgeDecoration extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f131976b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DecorationGravity f131977c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Set<Integer> f131978d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Rect f131979e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f131980f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GalleryBadgeDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cyclic_gallery_widget/GalleryBadgeDecoration$DecorationGravity;", "", "_avito_cyclic-gallery-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DecorationGravity {

        /* renamed from: b, reason: collision with root package name */
        public static final DecorationGravity f131981b;

        /* renamed from: c, reason: collision with root package name */
        public static final DecorationGravity f131982c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ DecorationGravity[] f131983d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f131984e;

        static {
            DecorationGravity decorationGravity = new DecorationGravity("TOP", 0);
            f131981b = decorationGravity;
            DecorationGravity decorationGravity2 = new DecorationGravity("BOTTOM", 1);
            f131982c = decorationGravity2;
            DecorationGravity[] decorationGravityArr = {decorationGravity, decorationGravity2};
            f131983d = decorationGravityArr;
            f131984e = c.a(decorationGravityArr);
        }

        public DecorationGravity() {
            throw null;
        }

        public static DecorationGravity valueOf(String str) {
            return (DecorationGravity) Enum.valueOf(DecorationGravity.class, str);
        }

        public static DecorationGravity[] values() {
            return (DecorationGravity[]) f131983d.clone();
        }
    }

    /* compiled from: GalleryBadgeDecoration.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DecorationGravity.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DecorationGravity decorationGravity = DecorationGravity.f131981b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public /* synthetic */ GalleryBadgeDecoration(View view, DecorationGravity decorationGravity, Set set, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? DecorationGravity.f131981b : decorationGravity, set);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:15:0x0027
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
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
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0039 -> B:13:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x003c -> B:13:0x0021). Please report as a decompilation issue!!! */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@Y61.k android.graphics.Canvas r13, @Y61.k androidx.recyclerview.widget.RecyclerView r14, @Y61.k androidx.recyclerview.widget.RecyclerView.z r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cyclic_gallery_widget.GalleryBadgeDecoration.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
    }

    public GalleryBadgeDecoration(@k View view, @k DecorationGravity decorationGravity, @k Set<Integer> set) {
        this.f131976b = view;
        this.f131977c = decorationGravity;
        this.f131978d = set;
        this.f131979e = new Rect();
    }
}
