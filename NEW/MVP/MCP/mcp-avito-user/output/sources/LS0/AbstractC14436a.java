package Ls0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceBookingAdditionalSettingsUxfLinksFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LLs0/a;", "LSK0/c;", "a", "LLs0/a$a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ls0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14436a implements SK0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f10162a;

    /* compiled from: ServiceBookingAdditionalSettingsUxfLinksFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLs0/a$a;", "LLs0/a;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ls0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0635a extends AbstractC14436a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C0635a f10163b = new C0635a();

        public C0635a() {
            super("srv_additional_settings_tech_break", null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0635a);
        }

        public final int hashCode() {
            return 528154477;
        }

        @k
        public final String toString() {
            return "TechBreakSetting";
        }
    }

    public AbstractC14436a(String str, C42822w c42822w) {
        this.f10162a = str;
    }

    @Override // SK0.c
    @k
    /* renamed from: a, reason: from getter */
    public final String getF10162a() {
        return this.f10162a;
    }
}
