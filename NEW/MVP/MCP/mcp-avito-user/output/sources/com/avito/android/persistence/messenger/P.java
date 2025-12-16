package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class P implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f215270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f215271c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChannelIsReadStatus f215272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f215275g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X f215276h;

    public P(X x12, List list, boolean z12, ChannelIsReadStatus channelIsReadStatus, String str, UserEntityType userEntityType, String str2) {
        this.f215276h = x12;
        this.f215270b = list;
        this.f215271c = z12;
        this.f215272d = channelIsReadStatus;
        this.f215273e = str;
        this.f215274f = userEntityType;
        this.f215275g = str2;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            update channel\n            set \n                is_read = ?,\n                is_read_status = ?\n            where\n                user_id = ?\n                and user_type = ?\n                and channel_id = ?\n                and is_read_status IN (");
        List<ChannelIsReadStatus> list = this.f215270b;
        V1.g.a(list.size(), sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("        ");
        String string = sbR.toString();
        X x12 = this.f215276h;
        Z1.i iVarE = x12.f215334a.e(string);
        iVarE.g1(1, this.f215271c ? 1L : 0L);
        int i12 = ChannelIsReadStatus.a.f215155a;
        iVarE.h4(2, this.f215272d.name());
        iVarE.h4(3, this.f215273e);
        int i13 = UserEntityType.a.f215321a;
        iVarE.h4(4, this.f215274f.f215320b);
        iVarE.h4(5, this.f215275g);
        int i14 = 6;
        for (ChannelIsReadStatus channelIsReadStatus : list) {
            int i15 = ChannelIsReadStatus.a.f215155a;
            iVarE.h4(i14, channelIsReadStatus.name());
            i14++;
        }
        MessengerDatabase_Impl messengerDatabase_Impl = x12.f215334a;
        messengerDatabase_Impl.c();
        try {
            iVarE.B3();
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            return null;
        } catch (Throwable th2) {
            messengerDatabase_Impl.l();
            throw th2;
        }
    }
}
