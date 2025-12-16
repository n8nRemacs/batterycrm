package com.avito.android.candy;

import android.net.Uri;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CandyCarRepository.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/candy/f;", "Lcom/avito/android/candy/e;", "a", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f114882a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f114883b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f114884c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f114885d = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f114886e = new LinkedHashMap();

    /* compiled from: CandyCarRepository.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/candy/f$a;", "", "a", "b", "Lcom/avito/android/candy/f$a$a;", "Lcom/avito/android/candy/f$a$b;", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: CandyCarRepository.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/candy/f$a$a;", "Lcom/avito/android/candy/f$a;", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.candy.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3352a implements a {

            /* renamed from: a, reason: collision with root package name */
            public final int f114887a;

            public C3352a(int i12) {
                this.f114887a = i12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3352a) && this.f114887a == ((C3352a) obj).f114887a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f114887a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.t(new StringBuilder("ResourceIdData(id="), this.f114887a, ')');
            }
        }

        /* compiled from: CandyCarRepository.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/candy/f$a$b;", "Lcom/avito/android/candy/f$a;", "_avito_candy-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Uri f114888a;

            public b(@Y61.k Uri uri) {
                this.f114888a = uri;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f114888a, ((b) obj).f114888a);
            }

            public final int hashCode() {
                return this.f114888a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.actions_sheet.a.t(new StringBuilder("UriData(uri="), this.f114888a, ')');
            }
        }
    }

    @Inject
    public f(@Y61.k u uVar, @Y61.k j jVar, @Y61.k r rVar) {
        this.f114882a = uVar;
        this.f114883b = jVar;
        this.f114884c = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    @Override // com.avito.android.candy.e
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.internal.operators.observable.C41981q0 a(@Y61.k java.lang.String r11, @Y61.k com.avito.android.candy.CandyImageState r12, @Y61.l final android.net.Uri r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.candy.f.a(java.lang.String, com.avito.android.candy.CandyImageState, android.net.Uri, int, int):io.reactivex.rxjava3.internal.operators.observable.q0");
    }
}
