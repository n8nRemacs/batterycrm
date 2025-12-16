package com.avito.android.messenger.conversation.mvi.messages.builders;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message.ExtendedGeo;
import com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.extended_item_message.ExtendedItemData;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ExtendedItemMessageStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/c;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {
    @Inject
    public c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    @Y61.k
    public static ExtendedItemData a(@Y61.k T1.d dVar) {
        ?? arrayList;
        MessageBody.SystemMessageBody.Platform.ItemExtended extended;
        List<MessageBody.SystemMessageBody.ExtendedTextFields> textFields;
        Parcelable content;
        ArrayList arrayList2;
        MessageBody.SystemMessageBody.Platform.Bubble f189195a = dVar.f189168c.getF189195a();
        MessageBody.SystemMessageBody.Platform.Bubble.Item item = f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Item ? (MessageBody.SystemMessageBody.Platform.Bubble.Item) f189195a : null;
        if (item == null || (extended = item.getExtended()) == null || (textFields = extended.getTextFields()) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            List<MessageBody.SystemMessageBody.ExtendedTextFields> list = textFields;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (MessageBody.SystemMessageBody.ExtendedTextFields extendedTextFields : list) {
                if (extendedTextFields instanceof MessageBody.SystemMessageBody.ExtendedTextFields.Text) {
                    MessageBody.SystemMessageBody.ExtendedTextFields.Text text = (MessageBody.SystemMessageBody.ExtendedTextFields.Text) extendedTextFields;
                    content = new ExtendedItemData.TextFields.Text(text.getType(), text.getContent());
                } else {
                    if (!(extendedTextFields instanceof MessageBody.SystemMessageBody.ExtendedTextFields.Content)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MessageBody.SystemMessageBody.ExtendedTextFields.Content content2 = (MessageBody.SystemMessageBody.ExtendedTextFields.Content) extendedTextFields;
                    String type = content2.getType();
                    String distance = content2.getContent().getDistance();
                    String distanceInTime = content2.getContent().getDistanceInTime();
                    List<MessageBody.SystemMessageBody.ExtendedColor> lines = content2.getContent().getLines();
                    if (lines == null) {
                        lines = C42784z0.f406748b;
                    }
                    if (!O2.a(lines)) {
                        lines = null;
                    }
                    if (lines != null) {
                        List<MessageBody.SystemMessageBody.ExtendedColor> list2 = lines;
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((MessageBody.SystemMessageBody.ExtendedColor) it.next()).getColor());
                        }
                        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(C43066x.a0((String) it2.next(), "0x", "#", true));
                        }
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = null;
                    }
                    content = new ExtendedItemData.TextFields.Content(type, new ExtendedGeo(distance, distanceInTime, content2.getContent().getName(), content2.getContent().getAddress(), arrayList2));
                }
                arrayList.add(content);
            }
        }
        return new ExtendedItemData(arrayList);
    }
}
