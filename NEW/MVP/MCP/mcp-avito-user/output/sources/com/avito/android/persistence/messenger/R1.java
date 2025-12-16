package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23458l0;
import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MessageMetaInfoDao.kt */
@androidx.room.A
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/persistence/messenger/R1;", "", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface R1 {

    /* compiled from: MessageMetaInfoDao.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
        @androidx.room.Q0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static void a(@Y61.k com.avito.android.persistence.messenger.C33132w2 r44, @Y61.k java.lang.String r45, @Y61.k java.lang.String r46, @Y61.k java.lang.String r47, @Y61.k com.avito.android.persistence.messenger.UserEntityType r48, @Y61.k java.lang.String r49, @Y61.l java.util.List r50, int r51, @Y61.k com.avito.android.persistence.messenger.TransferStatus r52) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.persistence.messenger.R1.a.a(com.avito.android.persistence.messenger.w2, java.lang.String, java.lang.String, java.lang.String, com.avito.android.persistence.messenger.UserEntityType, java.lang.String, java.util.List, int, com.avito.android.persistence.messenger.TransferStatus):void");
        }

        @androidx.room.Q0
        public static void b(@Y61.k C33132w2 c33132w2, @Y61.k ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e3 e3Var = (e3) it.next();
                String str = e3Var.f215457a;
                UserEntityType userEntityType = e3Var.f215461e;
                Iterator it2 = it;
                if (c33132w2.r(new Q1(str, e3Var.f215458b, e3Var.f215459c, null, null, 0L, null, null, null, e3Var.f215460d, null, 0L, 0L, null, null, null, false, null, null, userEntityType, e3Var.f215462f, null, e3Var.f215463g, 2620920, null)) < 0) {
                    MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
                    messengerDatabase_Impl.b();
                    androidx.room.O0 o02 = c33132w2.f215568m;
                    Z1.i iVarA = o02.a();
                    iVarA.g1(1, e3Var.f215460d);
                    String str2 = e3Var.f215463g;
                    if (str2 == null) {
                        iVarA.B4(2);
                    } else {
                        iVarA.h4(2, str2);
                    }
                    iVarA.h4(3, e3Var.f215457a);
                    iVarA.h4(4, e3Var.f215458b);
                    iVarA.h4(5, e3Var.f215459c);
                    int i12 = UserEntityType.a.f215321a;
                    iVarA.h4(6, userEntityType.f215320b);
                    try {
                        messengerDatabase_Impl.c();
                        try {
                            iVarA.B3();
                            messengerDatabase_Impl.s();
                        } finally {
                        }
                    } finally {
                        o02.c(iVarA);
                    }
                }
                it = it2;
            }
        }
    }

    @Y61.k
    @androidx.room.F
    io.reactivex.rxjava3.internal.operators.completable.r a(@Y61.k List list);

    @InterfaceC23458l0
    @Y61.k
    C42006d b();

    @androidx.room.Q0
    void c(@Y61.k ArrayList arrayList);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k UserEntityType userEntityType, @Y61.l ArrayList arrayList);

    @androidx.room.Q0
    void e(@Y61.k TransferStatus transferStatus, @Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r f(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k TransferStatus transferStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C42006d g(@Y61.k String str);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r h(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, long j12, long j13, @Y61.l String str5, @Y61.l String str6, int i12, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 i(@Y61.k String str, @Y61.k String str2, @Y61.k List list, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C42006d j(@Y61.k String str);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r k(@Y61.k TransferStatus transferStatus, @Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r l(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r m(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k TransferStatus transferStatus, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r n(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.k UserEntityType userEntityType);

    @androidx.room.Q0
    void o(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k UserEntityType userEntityType, @Y61.k String str4, @Y61.l List list, int i12, @Y61.k TransferStatus transferStatus);

    @InterfaceC23458l0
    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r p(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.k UserEntityType userEntityType);

    @InterfaceC23458l0
    @Y61.k
    C41933a0 q(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3);
}
