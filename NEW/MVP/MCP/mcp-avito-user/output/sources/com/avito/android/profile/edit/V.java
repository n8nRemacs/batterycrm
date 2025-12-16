package com.avito.android.profile.edit;

import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.remote.model.Profile;
import com.avito.android.util.Kundle;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/V;", "", "b", "c", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface V {

    /* compiled from: LocationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: LocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/profile/edit/V$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/profile/edit/V$b$a;", "Lcom/avito/android/profile/edit/V$b$b;", "Lcom/avito/android/profile/edit/V$b$c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: LocationInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/V$b$a;", "Lcom/avito/android/profile/edit/V$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {
            public a() {
                super(null);
            }
        }

        /* compiled from: LocationInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/V$b$b;", "Lcom/avito/android/profile/edit/V$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.profile.edit.V$b$b, reason: collision with other inner class name */
        public static final class C6716b extends b {
            public C6716b() {
                super(null);
            }
        }

        /* compiled from: LocationInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/edit/V$b$c;", "Lcom/avito/android/profile/edit/V$b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {
            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LocationInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/edit/V$c;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Profile f222011a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Location f222012b;

        public c(@Y61.l Profile profile, @Y61.l Location location) {
            this.f222011a = profile;
            this.f222012b = location;
        }

        public /* synthetic */ c(Profile profile, Location location, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : profile, location);
        }
    }

    @Y61.l
    Profile a();

    @Y61.k
    String b();

    @Y61.k
    ArrayList c();

    @Y61.k
    C41982q1 d(@Y61.l Location location, @Y61.l String str);

    @Y61.k
    Kundle d0();

    int e();

    @Y61.l
    NameIdEntity f();

    @Y61.k
    io.reactivex.rxjava3.core.z<b> g();

    void invalidate();

    @Y61.l
    Location j();
}
