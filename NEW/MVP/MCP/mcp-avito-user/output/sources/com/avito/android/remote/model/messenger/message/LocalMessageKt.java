package com.avito.android.remote.model.messenger.message;

import Y61.k;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: LocalMessage.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u001e\n\u0002\b\b\u001a\u0016\u0010\u0011\u001a\u00020\n*\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\nH\u0002\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u0001*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u001c\u0010\t\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00050\u000b8Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0016\u0010\u000e\u001a\u00020\n*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"isFromUser", "", "Lcom/avito/android/remote/model/messenger/message/MessageBody;", "(Lcom/avito/android/remote/model/messenger/message/MessageBody;)Z", "isMine", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Z", "isNotMine", "isNotRead", "longStr", "", "", "getLongStr", "(Ljava/util/Collection;)Ljava/lang/String;", "shortStr", "getShortStr", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Ljava/lang/String;", "userInfoStr", "marginPrefix", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class LocalMessageKt {
    @k
    public static final String getLongStr(@k Collection<LocalMessage> collection) {
        StringBuilder sb2 = new StringBuilder((collection.size() * 3) + 1);
        sb2.append("(size=" + collection.size() + ")[");
        int i12 = 0;
        for (Object obj : collection) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            sb2.append("\n\t");
            sb2.append((LocalMessage) obj);
            if (i12 < collection.size() - 1) {
                sb2.append(",");
            }
            i12 = i13;
        }
        sb2.append("]");
        return sb2.toString();
    }

    @k
    public static final String getShortStr(@k LocalMessage localMessage) {
        return "LocalMessage(localId='" + localMessage.getLocalId() + "', remoteId='" + localMessage.getRemoteId() + "', channelId='" + localMessage.getChannelId() + "', fromId='" + localMessage.getFromId() + "')";
    }

    public static final boolean isFromUser(@k MessageBody messageBody) {
        if (messageBody instanceof MessageBody.ItemReference ? true : messageBody instanceof MessageBody.Item ? true : messageBody instanceof MessageBody.LocalImage ? true : messageBody instanceof MessageBody.ImageReference ? true : messageBody instanceof MessageBody.ImageBody ? true : messageBody instanceof MessageBody.Link ? true : messageBody instanceof MessageBody.Location ? true : messageBody instanceof MessageBody.Text.Regular ? true : messageBody instanceof MessageBody.File ? true : messageBody instanceof MessageBody.Video ? true : messageBody instanceof MessageBody.Voice ? true : messageBody instanceof MessageBody.Text.Reaction ? true : messageBody instanceof MessageBody.Call ? true : messageBody instanceof MessageBody.AppCall ? true : messageBody instanceof MessageBody.Deleted ? true : messageBody instanceof MessageBody.Unknown ? true : messageBody instanceof MessageBody.SystemMessageBody.Platform.FromUser) {
            return true;
        }
        if (messageBody instanceof MessageBody.SystemMessageBody.Platform.FromAvito ? true : messageBody instanceof MessageBody.SystemMessageBody.Text ? true : messageBody instanceof MessageBody.SystemMessageBody.Unknown) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isMine(@k LocalMessage localMessage) {
        return L.f(localMessage.getFromId(), localMessage.getUserId());
    }

    public static final boolean isNotMine(@k LocalMessage localMessage) {
        return !L.f(localMessage.getFromId(), localMessage.getUserId());
    }

    public static final boolean isNotRead(@k LocalMessage localMessage) {
        return !localMessage.isRead();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userInfoStr(LocalMessage localMessage, String str) {
        LocalMessage.Type userType = localMessage.getUserType();
        if (userType instanceof LocalMessage.Type.Default) {
            StringBuilder sbA = r.A("\n                ", str, "userId='");
            sbA.append(localMessage.getUserId());
            sbA.append("',\n                ");
            sbA.append(str);
            sbA.append("userType='default'\n            ");
            return sbA.toString();
        }
        if (userType instanceof LocalMessage.Type.EmployeePersonal) {
            StringBuilder sbA2 = r.A("\n                ", str, "userId='");
            sbA2.append(localMessage.getUserId());
            sbA2.append("',\n                ");
            sbA2.append(str);
            sbA2.append("userType='employee_personal'\n            ");
            return sbA2.toString();
        }
        if (!(userType instanceof LocalMessage.Type.EmployeeCompany)) {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder sbA3 = r.A("\n                ", str, "userId='");
        sbA3.append(localMessage.getUserId());
        sbA3.append("',\n                ");
        sbA3.append(str);
        sbA3.append("userType='employee_company',\n                ");
        sbA3.append(str);
        sbA3.append("companyId='");
        sbA3.append(localMessage.getAccountId());
        sbA3.append("'\n            ");
        return sbA3.toString();
    }

    public static /* synthetic */ String userInfoStr$default(LocalMessage localMessage, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = HiAnalyticsConstant.REPORT_VAL_SEPARATOR;
        }
        return userInfoStr(localMessage, str);
    }
}
