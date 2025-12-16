package com.avito.android.position_in_search.storage;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BannerStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/storage/BannerStorage;", "", "Place", "_avito_position-in-search_storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BannerStorage {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerStorage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/storage/BannerStorage$Place;", "", "_avito_position-in-search_storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Place {

        /* renamed from: b, reason: collision with root package name */
        public static final Place f221758b;

        /* renamed from: c, reason: collision with root package name */
        public static final Place f221759c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Place[] f221760d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f221761e;

        static {
            Place place = new Place("INFO", 0);
            f221758b = place;
            Place place2 = new Place("PERIOD", 1);
            f221759c = place2;
            Place[] placeArr = {place, place2};
            f221760d = placeArr;
            f221761e = kotlin.enums.c.a(placeArr);
        }

        public Place() {
            throw null;
        }

        public static Place valueOf(String str) {
            return (Place) Enum.valueOf(Place.class, str);
        }

        public static Place[] values() {
            return (Place[]) f221760d.clone();
        }
    }

    @Y61.l
    Object a(@Y61.k Place place, @Y61.k String str, @Y61.k Continuation<? super G0> continuation);

    @Y61.l
    Object b(@Y61.k Place place, @Y61.k SuspendLambda suspendLambda);
}
