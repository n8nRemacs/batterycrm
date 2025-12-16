package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/universal_map/map/c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/universal_map/map/c$a;", "Lcom/avito/android/universal_map/map/c$b;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.universal_map.map.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC35293c {

    /* compiled from: UniversalPointsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/c$a;", "Lcom/avito/android/universal_map/map/c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.map.c$a */
    public static final class a extends AbstractC35293c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoMapBounds f304916a;

        public a(@Y61.k AvitoMapBounds avitoMapBounds) {
            super(null);
            this.f304916a = avitoMapBounds;
        }
    }

    /* compiled from: UniversalPointsViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/c$b;", "Lcom/avito/android/universal_map/map/c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.universal_map.map.c$b */
    public static final class b extends AbstractC35293c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AvitoMapPoint f304917a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f304918b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Float f304919c;

        public b(@Y61.k AvitoMapPoint avitoMapPoint, boolean z12, @Y61.l Float f12) {
            super(null);
            this.f304917a = avitoMapPoint;
            this.f304918b = z12;
            this.f304919c = f12;
        }
    }

    public /* synthetic */ AbstractC35293c(C42822w c42822w) {
        this();
    }

    public AbstractC35293c() {
    }
}
