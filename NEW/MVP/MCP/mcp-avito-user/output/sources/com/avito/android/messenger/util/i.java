package com.avito.android.messenger.util;

import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.MessengerUserType;

/* compiled from: MessengerUserInfoExt.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {

    /* compiled from: MessengerUserInfoExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[UserEntityType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UserEntityType userEntityType = UserEntityType.f215315c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                UserEntityType userEntityType2 = UserEntityType.f215315c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Y61.k
    public static final LinkedHashMap a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Q... qArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(ChannelContext.Item.USER_ID, messengerUserHashInfo.f430680b);
        MessengerUserType messengerUserType = messengerUserHashInfo.f430681c;
        linkedHashMap.put("userType", e(messengerUserType));
        if (messengerUserType instanceof MessengerUserType.Employee.Company) {
            linkedHashMap.put("companyId", ((MessengerUserType.Employee.Company) messengerUserType).f430684b);
        }
        P0.n(linkedHashMap, qArr);
        return linkedHashMap;
    }

    @Y61.k
    public static final String b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Q<String, ? extends Object>... qArr) {
        LinkedHashMap linkedHashMapA = a(messengerUserHashInfo, (Q[]) Arrays.copyOf(qArr, qArr.length));
        StringBuilder sb2 = new StringBuilder();
        int i12 = 0;
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            sb2.append((String) entry.getKey());
            sb2.append(" = ");
            sb2.append(entry.getValue());
            if (i12 != linkedHashMapA.size() - 1) {
                sb2.append(", ");
            }
            i12++;
        }
        return sb2.toString();
    }

    @Y61.k
    public static final MessengerUserHashInfo c(@Y61.k LocalMessage localMessage) {
        return d(localMessage.getUserId(), localMessage.getAccountId(), f(localMessage.getUserType()));
    }

    public static final MessengerUserHashInfo d(String str, String str2, UserEntityType userEntityType) {
        int iOrdinal = userEntityType.ordinal();
        if (iOrdinal == 0) {
            return new MessengerUserHashInfo(str, MessengerUserType.Default.f430683b);
        }
        if (iOrdinal == 1) {
            return new MessengerUserHashInfo(str, MessengerUserType.Employee.Personal.f430685b);
        }
        if (iOrdinal == 2) {
            return str2.length() == 0 ? new MessengerUserHashInfo(str, MessengerUserType.Default.f430683b) : new MessengerUserHashInfo(str2, new MessengerUserType.Employee.Company(str));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final String e(@Y61.k MessengerUserType messengerUserType) {
        if (messengerUserType instanceof MessengerUserType.Default) {
            return "default";
        }
        if (messengerUserType instanceof MessengerUserType.Employee.Company) {
            return "employee_company";
        }
        if (messengerUserType instanceof MessengerUserType.Employee.Personal) {
            return "employee_personal";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final UserEntityType f(@Y61.k LocalMessage.Type type) {
        if (type instanceof LocalMessage.Type.Default) {
            return UserEntityType.f215315c;
        }
        if (type instanceof LocalMessage.Type.EmployeeCompany) {
            return UserEntityType.f215317e;
        }
        if (type instanceof LocalMessage.Type.EmployeePersonal) {
            return UserEntityType.f215316d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final UserEntityType g(@Y61.k MessengerUserType messengerUserType) {
        if (messengerUserType instanceof MessengerUserType.Default) {
            return UserEntityType.f215315c;
        }
        if (messengerUserType instanceof MessengerUserType.Employee.Company) {
            return UserEntityType.f215317e;
        }
        if (messengerUserType instanceof MessengerUserType.Employee.Personal) {
            return UserEntityType.f215316d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public static final String h(@Y61.k MessengerUserType messengerUserType) {
        if (messengerUserType instanceof MessengerUserType.Default) {
            return "";
        }
        if (messengerUserType instanceof MessengerUserType.Employee.Company) {
            return "||".concat("employee_cmp");
        }
        if (messengerUserType instanceof MessengerUserType.Employee.Personal) {
            return "||".concat("employee");
        }
        throw new NoWhenBranchMatchedException();
    }
}
