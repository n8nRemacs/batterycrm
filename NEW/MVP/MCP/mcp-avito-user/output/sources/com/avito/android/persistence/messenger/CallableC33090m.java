package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33090m implements Callable<List<Y>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f215513c;

    public CallableC33090m(X x12, androidx.room.F0 f02) {
        this.f215513c = x12;
        this.f215512b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<Y> call() throws Throwable {
        String string;
        int i12;
        Long lValueOf;
        int i13;
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215513c.f215334a;
        messengerDatabase_Impl.c();
        try {
            try {
                Cursor cursorB = V1.c.b(messengerDatabase_Impl, this.f215512b, false);
                try {
                    int iB2 = V1.b.b(cursorB, "user_id");
                    int iB3 = V1.b.b(cursorB, "channel_id");
                    int iB4 = V1.b.b(cursorB, "type");
                    int iB5 = V1.b.b(cursorB, "created");
                    int iB6 = V1.b.b(cursorB, "updated");
                    int iB7 = V1.b.b(cursorB, "context_type");
                    int iB8 = V1.b.b(cursorB, "json_context");
                    int iB9 = V1.b.b(cursorB, "json_read_only_state");
                    int iB10 = V1.b.b(cursorB, "is_deleted");
                    int iB11 = V1.b.b(cursorB, "is_read");
                    int iB12 = V1.b.b(cursorB, "is_read_status");
                    int iB13 = V1.b.b(cursorB, "is_spam");
                    int iB14 = V1.b.b(cursorB, "is_answered");
                    int iB15 = V1.b.b(cursorB, "json_context_actions");
                    try {
                        int iB16 = V1.b.b(cursorB, MessageBody.SystemMessageBody.Platform.FLOW);
                        int iB17 = V1.b.b(cursorB, "suspect_message_id");
                        int iB18 = V1.b.b(cursorB, "item_id");
                        int iB19 = V1.b.b(cursorB, "interlocutor_id");
                        int iB20 = V1.b.b(cursorB, "json_display_info");
                        int iB21 = V1.b.b(cursorB, "json_input_state");
                        int iB22 = V1.b.b(cursorB, "pin_order");
                        int iB23 = V1.b.b(cursorB, "user_type");
                        int i14 = iB15;
                        ArrayList arrayList = new ArrayList(cursorB.getCount());
                        while (cursorB.moveToNext()) {
                            String string2 = cursorB.getString(iB2);
                            String string3 = cursorB.getString(iB3);
                            String string4 = cursorB.getString(iB4);
                            long j12 = cursorB.getLong(iB5);
                            long j13 = cursorB.getLong(iB6);
                            String string5 = cursorB.getString(iB7);
                            String string6 = cursorB.getString(iB8);
                            String string7 = cursorB.isNull(iB9) ? null : cursorB.getString(iB9);
                            boolean z12 = cursorB.getInt(iB10) != 0;
                            boolean z13 = cursorB.getInt(iB11) != 0;
                            String string8 = cursorB.getString(iB12);
                            int i15 = ChannelIsReadStatus.a.f215155a;
                            ChannelIsReadStatus channelIsReadStatusValueOf = ChannelIsReadStatus.valueOf(string8);
                            boolean z14 = cursorB.getInt(iB13) != 0;
                            boolean z15 = cursorB.getInt(iB14) != 0;
                            int i16 = i14;
                            int i17 = iB2;
                            String string9 = cursorB.isNull(i16) ? null : cursorB.getString(i16);
                            int i18 = iB16;
                            String string10 = cursorB.isNull(i18) ? null : cursorB.getString(i18);
                            int i19 = iB17;
                            String string11 = cursorB.isNull(i19) ? null : cursorB.getString(i19);
                            int i22 = iB18;
                            String string12 = cursorB.isNull(i22) ? null : cursorB.getString(i22);
                            int i23 = iB19;
                            String string13 = cursorB.isNull(i23) ? null : cursorB.getString(i23);
                            int i24 = iB20;
                            String string14 = cursorB.getString(i24);
                            int i25 = iB21;
                            if (cursorB.isNull(i25)) {
                                iB21 = i25;
                                i12 = iB22;
                                string = null;
                            } else {
                                string = cursorB.getString(i25);
                                iB21 = i25;
                                i12 = iB22;
                            }
                            if (cursorB.isNull(i12)) {
                                iB22 = i12;
                                i13 = iB23;
                                lValueOf = null;
                            } else {
                                lValueOf = Long.valueOf(cursorB.getLong(i12));
                                iB22 = i12;
                                i13 = iB23;
                            }
                            iB23 = i13;
                            arrayList.add(new Y(string2, string3, string4, j12, j13, string5, string6, string7, z12, z13, channelIsReadStatusValueOf, z14, z15, string9, string10, string11, string12, string13, string14, string, lValueOf, UserEntityType.a.a(cursorB.getString(i13))));
                            iB2 = i17;
                            i14 = i16;
                            iB16 = i18;
                            iB17 = i19;
                            iB18 = i22;
                            iB19 = i23;
                            iB20 = i24;
                        }
                        messengerDatabase_Impl.s();
                        cursorB.close();
                        messengerDatabase_Impl.l();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorB.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                messengerDatabase_Impl.l();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            messengerDatabase_Impl.l();
            throw th;
        }
    }

    public final void finalize() {
        this.f215512b.d();
    }
}
