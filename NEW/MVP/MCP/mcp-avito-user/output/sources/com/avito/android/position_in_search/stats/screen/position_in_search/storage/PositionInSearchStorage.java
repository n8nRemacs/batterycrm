package com.avito.android.position_in_search.stats.screen.position_in_search.storage;

import Y61.k;
import Y61.l;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: PositionInSearchStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/storage/PositionInSearchStorage;", "", "Place", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface PositionInSearchStorage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PositionInSearchStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/position_in_search/storage/PositionInSearchStorage$Place;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Place {

        /* renamed from: b, reason: collision with root package name */
        public static final Place f221563b;

        /* renamed from: c, reason: collision with root package name */
        public static final Place f221564c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Place[] f221565d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f221566e;

        static {
            Place place = new Place("INFO", 0);
            f221563b = place;
            Place place2 = new Place("PERIOD", 1);
            f221564c = place2;
            Place[] placeArr = {place, place2};
            f221565d = placeArr;
            f221566e = kotlin.enums.c.a(placeArr);
        }

        public Place() {
            throw null;
        }

        public static Place valueOf(String str) {
            return (Place) Enum.valueOf(Place.class, str);
        }

        public static Place[] values() {
            return (Place[]) f221565d.clone();
        }
    }

    @l
    Object a(@k Place place, @k String str, @k Continuation<? super G0> continuation);

    @k
    Set<String> b(@k Place place);
}
