package s70;

import AK0.l;
import Y61.k;
import com.avito.android.phone_confirmation.state.PhoneConfirmationTime;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneConfirmationTimeStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls70/c;", "Ls70/b;", "_avito_phone-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: s70.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C48009c implements InterfaceC48008b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f437488a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437489b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f437490c;

    @Inject
    public C48009c(@k l lVar) {
        this.f437488a = lVar;
        C48007a c48007a = C48007a.f437485a;
        c48007a.getClass();
        this.f437489b = C48007a.f437486b;
        c48007a.getClass();
        this.f437490c = C48007a.f437487c;
    }

    @Override // s70.InterfaceC48008b
    @Y61.l
    public final PhoneConfirmationTime a() {
        l lVar = this.f437488a;
        long j12 = lVar.getLong(this.f437490c, -1L);
        String string = lVar.getString(this.f437489b, null);
        if (j12 == -1 || string == null) {
            return null;
        }
        return new PhoneConfirmationTime(string, j12);
    }

    @Override // s70.InterfaceC48008b
    public final void b(@Y61.l PhoneConfirmationTime phoneConfirmationTime) {
        long j12 = phoneConfirmationTime != null ? phoneConfirmationTime.f215966c : -1L;
        String str = phoneConfirmationTime != null ? phoneConfirmationTime.f215965b : null;
        l lVar = this.f437488a;
        lVar.putLong(this.f437490c, j12);
        lVar.putString(this.f437489b, str);
    }
}
