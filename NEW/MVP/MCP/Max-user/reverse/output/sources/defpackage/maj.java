package defpackage;

import android.content.res.XmlResourceParser;
import android.graphics.Color;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class maj {
    public static final LinkedHashMap a(XmlResourceParser xmlResourceParser) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            linkedHashMap.put(xmlResourceParser.getAttributeName(i), Integer.valueOf(i));
        }
        return linkedHashMap;
    }

    public static final ConversationEndReason b(a0f a0fVar) {
        switch (a0fVar == null ? -1 : rze.$EnumSwitchMapping$0[a0fVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return ConversationEndReason.Canceled.INSTANCE;
            case 2:
                return ConversationEndReason.Rejected.INSTANCE;
            case 3:
                return ConversationEndReason.Hangup.INSTANCE;
            case 4:
                return ConversationEndReason.Missed.INSTANCE;
            case 5:
                return ConversationEndReason.SignalingTimeout.INSTANCE;
            case 6:
                return ConversationEndReason.Busy.INSTANCE;
            case 7:
                return new ConversationEndReason.Error(new RuntimeException("Closed by the server error"));
            case 8:
                return ConversationEndReason.RemovedFromCall.INSTANCE;
            case 9:
                return ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE;
            case 10:
                return ConversationEndReason.EndedForAll.INSTANCE;
            case 11:
                return ConversationEndReason.CallTimeout.INSTANCE;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ConversationEndReason.Banned.INSTANCE;
        }
    }

    public static final int c(String str) {
        int length = str.length();
        if (length == 2) {
            StringBuilder sb = new StringBuilder("#");
            for (int i = 0; i < 8; i++) {
                sb.append(str.charAt(1));
            }
            return Color.parseColor(sb.toString());
        }
        if (length != 4) {
            if (length == 7 || length == 9) {
                return Color.parseColor(str);
            }
            return 0;
        }
        return Color.parseColor("#" + str.charAt(1) + str.charAt(1) + str.charAt(2) + str.charAt(2) + str.charAt(3) + str.charAt(3));
    }
}
