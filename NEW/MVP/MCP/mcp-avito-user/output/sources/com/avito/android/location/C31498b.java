package com.avito.android.location;

import android.util.SparseArray;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.parse.adapter.SparseArrayTypeAdapter;
import kotlin.Metadata;

/* compiled from: FileLocation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location/b;", "", "a", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31498b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f181729a;

    /* renamed from: b, reason: collision with root package name */
    @com.google.gson.annotations.b(SparseArrayTypeAdapter.class)
    @Y61.k
    public final SparseArray<String> f181730b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f181731c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f181732d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f181733e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f181734f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final a f181735g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Coordinates f181736h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Boolean f181737i;

    /* compiled from: FileLocation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/b$a;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f181738a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SparseArray<String> f181739b;

        public a(@Y61.k String str, @Y61.k SparseArray<String> sparseArray) {
            this.f181738a = str;
            this.f181739b = sparseArray;
        }
    }

    public C31498b(@Y61.k String str, @Y61.k SparseArray sparseArray, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l a aVar, @Y61.l Coordinates coordinates, @Y61.l Boolean bool) {
        this.f181729a = str;
        this.f181730b = sparseArray;
        this.f181731c = z12;
        this.f181732d = z13;
        this.f181733e = z14;
        this.f181734f = z15;
        this.f181735g = aVar;
        this.f181736h = coordinates;
        this.f181737i = bool;
    }
}
