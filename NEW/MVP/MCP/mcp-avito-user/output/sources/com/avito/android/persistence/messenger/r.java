package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class r implements Callable<List<Y>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f215539c;

    public r(X x12, androidx.room.F0 f02) {
        this.f215539c = x12;
        this.f215538b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<Y> call() {
        String string;
        int i12;
        Long lValueOf;
        int i13;
        Cursor cursorP = this.f215539c.f215334a.p(this.f215538b);
        try {
            int iB2 = V1.b.b(cursorP, "user_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "type");
            int iB5 = V1.b.b(cursorP, "created");
            int iB6 = V1.b.b(cursorP, "updated");
            int iB7 = V1.b.b(cursorP, "context_type");
            int iB8 = V1.b.b(cursorP, "json_context");
            int iB9 = V1.b.b(cursorP, "json_read_only_state");
            int iB10 = V1.b.b(cursorP, "is_deleted");
            int iB11 = V1.b.b(cursorP, "is_read");
            int iB12 = V1.b.b(cursorP, "is_read_status");
            int iB13 = V1.b.b(cursorP, "is_spam");
            int iB14 = V1.b.b(cursorP, "is_answered");
            int iB15 = V1.b.b(cursorP, "json_context_actions");
            int iB16 = V1.b.b(cursorP, MessageBody.SystemMessageBody.Platform.FLOW);
            int iB17 = V1.b.b(cursorP, "suspect_message_id");
            int iB18 = V1.b.b(cursorP, "item_id");
            int iB19 = V1.b.b(cursorP, "interlocutor_id");
            int iB20 = V1.b.b(cursorP, "json_display_info");
            int iB21 = V1.b.b(cursorP, "json_input_state");
            int iB22 = V1.b.b(cursorP, "pin_order");
            int iB23 = V1.b.b(cursorP, "user_type");
            int i14 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string2 = cursorP.getString(iB2);
                String string3 = cursorP.getString(iB3);
                String string4 = cursorP.getString(iB4);
                long j12 = cursorP.getLong(iB5);
                long j13 = cursorP.getLong(iB6);
                String string5 = cursorP.getString(iB7);
                String string6 = cursorP.getString(iB8);
                String string7 = cursorP.isNull(iB9) ? null : cursorP.getString(iB9);
                boolean z12 = cursorP.getInt(iB10) != 0;
                boolean z13 = cursorP.getInt(iB11) != 0;
                String string8 = cursorP.getString(iB12);
                int i15 = ChannelIsReadStatus.a.f215155a;
                ChannelIsReadStatus channelIsReadStatusValueOf = ChannelIsReadStatus.valueOf(string8);
                boolean z14 = cursorP.getInt(iB13) != 0;
                int i16 = iB2;
                int i17 = i14;
                boolean z15 = cursorP.getInt(iB14) != 0;
                String string9 = cursorP.isNull(i17) ? null : cursorP.getString(i17);
                int i18 = iB16;
                String string10 = cursorP.isNull(i18) ? null : cursorP.getString(i18);
                int i19 = iB17;
                String string11 = cursorP.isNull(i19) ? null : cursorP.getString(i19);
                int i22 = iB18;
                String string12 = cursorP.isNull(i22) ? null : cursorP.getString(i22);
                int i23 = iB19;
                String string13 = cursorP.isNull(i23) ? null : cursorP.getString(i23);
                int i24 = iB20;
                String string14 = cursorP.getString(i24);
                int i25 = iB21;
                if (cursorP.isNull(i25)) {
                    iB21 = i25;
                    i12 = iB22;
                    string = null;
                } else {
                    string = cursorP.getString(i25);
                    iB21 = i25;
                    i12 = iB22;
                }
                if (cursorP.isNull(i12)) {
                    iB22 = i12;
                    i13 = iB23;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorP.getLong(i12));
                    iB22 = i12;
                    i13 = iB23;
                }
                iB23 = i13;
                arrayList.add(new Y(string2, string3, string4, j12, j13, string5, string6, string7, z12, z13, channelIsReadStatusValueOf, z14, z15, string9, string10, string11, string12, string13, string14, string, lValueOf, UserEntityType.a.a(cursorP.getString(i13))));
                i14 = i17;
                iB16 = i18;
                iB17 = i19;
                iB18 = i22;
                iB19 = i23;
                iB2 = i16;
                iB20 = i24;
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215538b.d();
    }
}
