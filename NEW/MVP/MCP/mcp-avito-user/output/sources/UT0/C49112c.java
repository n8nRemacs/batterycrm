package ut0;

import Y61.k;
import com.avito.android.remote.R0;
import dagger.internal.f;
import dagger.internal.h;
import dagger.internal.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DayScheduleApi_Module_ProvideDayScheduleApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lut0/c;", "Ldagger/internal/h;", "Lut0/a;", "a", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ut0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49112c implements h<InterfaceC49110a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f440315b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f440316a;

    /* compiled from: DayScheduleApi_Module_ProvideDayScheduleApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lut0/c$a;", "", "<init>", "()V", "_avito_service-booking-day-settings_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ut0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C49112c(@k f fVar) {
        this.f440316a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f440316a.get();
        f440315b.getClass();
        C49111b.f440314a.getClass();
        InterfaceC49110a interfaceC49110a = (InterfaceC49110a) r02.create(InterfaceC49110a.class);
        t.b(interfaceC49110a, "Cannot return null from a non-@Nullable @Provides method");
        return interfaceC49110a;
    }
}
