package dZ;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: UserInfoPersistHelper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LdZ/j;", "", "<init>", "()V", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j {

    /* compiled from: UserInfoPersistHelper.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LdZ/j$a;", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC39683a<MessengerUserHashInfo> {
        @Override // dZ.InterfaceC39683a
        public final MessengerUserHashInfo a(h hVar) {
            String string = hVar.getString(ChannelContext.Item.USER_ID);
            MessengerUserHashInfo messengerUserHashInfo = null;
            if (string == null || C43066x.K(string)) {
                string = null;
            }
            if (string != null) {
                messengerUserHashInfo = new MessengerUserHashInfo(string, hVar.b() ? MessengerUserType.Employee.Personal.f430685b : MessengerUserType.Default.f430683b);
            }
            return messengerUserHashInfo;
        }

        @Override // dZ.InterfaceC39683a
        public final void b(i iVar, MessengerUserHashInfo messengerUserHashInfo) {
            MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
            iVar.putString(ChannelContext.Item.USER_ID, messengerUserHashInfo2.f430682d);
            MessengerUserType messengerUserType = messengerUserHashInfo2.f430681c;
            if (messengerUserType instanceof MessengerUserType.Default) {
                iVar.b(false);
                return;
            }
            if (messengerUserType instanceof MessengerUserType.Employee.Company ? true : messengerUserType instanceof MessengerUserType.Employee.Personal) {
                iVar.b(true);
            }
        }
    }

    /* compiled from: UserInfoPersistHelper.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LdZ/j$b;", "LdZ/a;", "Lru/avito/messenger/MessengerUserHashInfo;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC39683a<MessengerUserHashInfo> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f393914a;

        /* compiled from: UserInfoPersistHelper.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LdZ/j$b$a;", "", "<init>", "()V", "", "DEFAULT_USER_TYPE", "I", "EMPLOYEE_COMPANY_USER_TYPE", "EMPLOYEE_PERSONAL_USER_TYPE", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public b(@k String str) {
            this.f393914a = str;
        }

        @Override // dZ.InterfaceC39683a
        public final MessengerUserHashInfo a(h hVar) {
            String string = hVar.getString(ChannelContext.Item.USER_ID);
            if (string == null || C43066x.K(string)) {
                string = null;
            }
            if (string == null) {
                return null;
            }
            String string2 = hVar.getString(this.f393914a);
            if (string2 == null || C43066x.K(string2)) {
                string2 = null;
            }
            if (string2 == null) {
                return null;
            }
            int iA2 = hVar.a("userType");
            return iA2 != 1 ? iA2 != 2 ? new MessengerUserHashInfo(string, MessengerUserType.Default.f430683b) : new MessengerUserHashInfo(string2, new MessengerUserType.Employee.Company(string)) : new MessengerUserHashInfo(string, MessengerUserType.Employee.Personal.f430685b);
        }

        @Override // dZ.InterfaceC39683a
        public final void b(i iVar, MessengerUserHashInfo messengerUserHashInfo) {
            int i12;
            MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
            iVar.putString(ChannelContext.Item.USER_ID, messengerUserHashInfo2.f430682d);
            iVar.putString(this.f393914a, messengerUserHashInfo2.f430680b);
            MessengerUserType messengerUserType = messengerUserHashInfo2.f430681c;
            if (messengerUserType instanceof MessengerUserType.Default) {
                i12 = 0;
            } else if (messengerUserType instanceof MessengerUserType.Employee.Company) {
                i12 = 2;
            } else {
                if (!(messengerUserType instanceof MessengerUserType.Employee.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                i12 = 1;
            }
            iVar.a(i12, "userType");
        }
    }

    static {
        new j();
    }
}
