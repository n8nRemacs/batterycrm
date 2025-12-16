package com.airbnb.lottie.model.content;

import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.animation.content.u;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.P;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class ShapeStroke implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f59693a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final com.airbnb.lottie.model.animatable.b f59694b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f59695c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.a f59696d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.d f59697e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.b f59698f;

    /* renamed from: g, reason: collision with root package name */
    public final LineCapType f59699g;

    /* renamed from: h, reason: collision with root package name */
    public final LineJoinType f59700h;

    /* renamed from: i, reason: collision with root package name */
    public final float f59701i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f59702j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineCapType {

        /* renamed from: b, reason: collision with root package name */
        public static final LineCapType f59703b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LineCapType[] f59704c;

        static {
            LineCapType lineCapType = new LineCapType("BUTT", 0);
            f59703b = lineCapType;
            f59704c = new LineCapType[]{lineCapType, new LineCapType("ROUND", 1), new LineCapType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2)};
        }

        public LineCapType() {
            throw null;
        }

        public static LineCapType valueOf(String str) {
            return (LineCapType) Enum.valueOf(LineCapType.class, str);
        }

        public static LineCapType[] values() {
            return (LineCapType[]) f59704c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LineJoinType {

        /* renamed from: b, reason: collision with root package name */
        public static final LineJoinType f59705b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ LineJoinType[] f59706c;

        static {
            LineJoinType lineJoinType = new LineJoinType("MITER", 0);
            f59705b = lineJoinType;
            f59706c = new LineJoinType[]{lineJoinType, new LineJoinType("ROUND", 1), new LineJoinType("BEVEL", 2)};
        }

        public LineJoinType() {
            throw null;
        }

        public static LineJoinType valueOf(String str) {
            return (LineJoinType) Enum.valueOf(LineJoinType.class, str);
        }

        public static LineJoinType[] values() {
            return (LineJoinType[]) f59706c.clone();
        }
    }

    public ShapeStroke(String str, @P com.airbnb.lottie.model.animatable.b bVar, ArrayList arrayList, com.airbnb.lottie.model.animatable.a aVar, com.airbnb.lottie.model.animatable.d dVar, com.airbnb.lottie.model.animatable.b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f12, boolean z12) {
        this.f59693a = str;
        this.f59694b = bVar;
        this.f59695c = arrayList;
        this.f59696d = aVar;
        this.f59697e = dVar;
        this.f59698f = bVar2;
        this.f59699g = lineCapType;
        this.f59700h = lineJoinType;
        this.f59701i = f12;
        this.f59702j = z12;
    }

    @Override // com.airbnb.lottie.model.content.c
    public final com.airbnb.lottie.animation.content.c a(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar) {
        return new u(b12, bVar, this);
    }
}
