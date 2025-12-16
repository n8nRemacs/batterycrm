package dd;

import AK0.l;
import Y61.k;
import Zc.C19533a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.squareup.anvil.annotations.ContributesBinding;
import fd.C40400a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeviceInfoStorage.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ldd/b;", "Ldd/a;", "a", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dd.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39705b implements InterfaceC39704a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f393973a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f393974b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f393975c;

    /* compiled from: DeviceInfoStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldd/b$a;", "", "<init>", "()V", "_common_antifraud_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dd.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public C39705b(@C40400a.InterfaceC11162a @k l lVar, @k Gson gson, @k InterfaceC28373a interfaceC28373a) {
        this.f393973a = lVar;
        this.f393974b = gson;
        this.f393975c = interfaceC28373a;
    }

    @Override // dd.InterfaceC39704a
    public final void a(@k C19533a c19533a) {
        this.f393973a.putString("device_info", this.f393974b.l(c19533a));
    }

    @Override // dd.InterfaceC39704a
    @Y61.l
    public final C19533a b() {
        try {
            return (C19533a) this.f393974b.d(C19533a.class, this.f393973a.getString("device_info", null));
        } catch (JsonParseException e12) {
            this.f393975c.c(new NonFatalErrorEvent("Error while extracting saved device info", e12, null, null, 12, null));
            return null;
        }
    }
}
