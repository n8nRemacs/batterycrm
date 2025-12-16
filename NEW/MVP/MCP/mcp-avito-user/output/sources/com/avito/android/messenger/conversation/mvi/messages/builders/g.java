package com.avito.android.messenger.conversation.mvi.messages.builders;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.ChannelItemContentType;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;

/* compiled from: ImageMessageDataBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/g;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28373a f192139a;

    /* compiled from: ImageMessageDataBuilder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/builders/g$a;", "", "<init>", "()V", "", "HIGH_RES_SIZE_PX", "I", "LOW_RES_SIZE_PX", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            Map.Entry entry = (Map.Entry) t12;
            Map.Entry entry2 = (Map.Entry) t13;
            return kotlin.comparisons.a.b(Integer.valueOf(Math.min(((Size) entry.getKey()).getHeight(), ((Size) entry.getKey()).getWidth())), Integer.valueOf(Math.min(((Size) entry2.getKey()).getHeight(), ((Size) entry2.getKey()).getWidth())));
        }
    }

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f192140l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image);
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.l InterfaceC28373a interfaceC28373a) {
        this.f192139a = interfaceC28373a;
    }

    public static Uri b(int i12, Image image) {
        Object next;
        Uri uri;
        Set<Map.Entry<Size, Uri>> setEntrySet = image.getVariants().entrySet();
        TreeSet treeSet = new TreeSet(new b());
        C42745f0.I0(setEntrySet, treeSet);
        Iterator it = treeSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            if (((Size) entry.getKey()).getHeight() >= i12 && ((Size) entry.getKey()).getWidth() >= i12) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null && (uri = (Uri) entry2.getValue()) != null) {
            return uri;
        }
        Map.Entry entry3 = (Map.Entry) C42745f0.R(treeSet);
        if (entry3 != null) {
            return (Uri) entry3.getValue();
        }
        return null;
    }

    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i a(@Y61.k T1.d dVar, @Y61.k LocalMessage localMessage) {
        com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i iVar;
        if (!ChannelItemContentType.f189031c.a(dVar) && !ChannelItemContentType.f189034f.a(dVar) && !ChannelItemContentType.f189038j.a(dVar)) {
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i.f192514c.getClass();
            return com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i.f192515d;
        }
        T1.d.b bVar = dVar.f189168c;
        MessageBody f189194a = bVar.getF189194a();
        if (f189194a instanceof MessageBody.ImageReference) {
            com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i.f192514c.getClass();
            return com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i.f192515d;
        }
        if (f189194a instanceof MessageBody.ImageBody) {
            Q<Uri, Uri> qC2 = c(f189194a, null);
            iVar = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i(qC2.f406619b, qC2.f406620c);
        } else if (f189194a instanceof MessageBody.Link) {
            Q<Uri, Uri> qC3 = c(f189194a, null);
            iVar = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i(qC3.f406619b, qC3.f406620c);
        } else if (f189194a instanceof MessageBody.LocalImage) {
            Q<Uri, Uri> qC4 = c(f189194a, null);
            iVar = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i(qC4.f406619b, qC4.f406620c);
        } else {
            MessageBody.SystemMessageBody.Platform.Bubble f189195a = bVar.getF189195a();
            if (!(f189195a instanceof MessageBody.SystemMessageBody.Platform.Bubble.Image)) {
                NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("ImageMessageDataBuilder: Unsupported bodyOrBubble: " + bVar, null, null, null, 14, null);
                V2.f318762a.f(nonFatalErrorEvent);
                InterfaceC28373a interfaceC28373a = this.f192139a;
                if (interfaceC28373a != null) {
                    interfaceC28373a.c(nonFatalErrorEvent);
                }
                com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i.f192514c.getClass();
                return com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i.f192515d;
            }
            Q<Uri, Uri> qC5 = c(localMessage.getBody(), ((MessageBody.SystemMessageBody.Platform.Bubble.Image) f189195a).getImageId());
            iVar = new com.avito.android.messenger.conversation.mvi.messages.composables.messages.message_content.image_message.i(qC5.f406619b, qC5.f406620c);
        }
        return iVar;
    }

    public final Q<Uri, Uri> c(MessageBody messageBody, String str) {
        Object next;
        Image image;
        Image image2;
        if (messageBody instanceof MessageBody.ImageBody) {
            Image image3 = ((MessageBody.ImageBody) messageBody).getImage();
            return new Q<>(b(480, image3), b(60, image3));
        }
        if (messageBody instanceof MessageBody.LocalImage) {
            MessageBody.LocalImage localImage = (MessageBody.LocalImage) messageBody;
            return new Q<>(localImage.getSource(), localImage.getSource());
        }
        boolean z12 = messageBody instanceof MessageBody.Link;
        InterfaceC28373a interfaceC28373a = this.f192139a;
        if (z12) {
            MessageBody.Link.Preview preview = ((MessageBody.Link) messageBody).getPreview();
            if (preview != null && (image2 = preview.getImage()) != null) {
                return new Q<>(b(480, image2), b(60, image2));
            }
            if (interfaceC28373a != null) {
                interfaceC28373a.c(new NonFatalErrorEvent("ImageMessageDataBuilder: MessageBody.Link.Preview image is null: " + messageBody, null, null, null, 14, null));
            }
            return new Q<>(null, null);
        }
        if (!(messageBody instanceof MessageBody.SystemMessageBody.Platform)) {
            if (interfaceC28373a != null) {
                interfaceC28373a.c(new NonFatalErrorEvent("ImageMessageDataBuilder: MessageBody.Link.Preview image is null: " + messageBody, null, null, null, 14, null));
            }
            return new Q<>(null, null);
        }
        C43025h.a aVar = new C43025h.a(C43033p.i(new C42770s0(((MessageBody.SystemMessageBody.Platform) messageBody).getChunks()), c.f192140l));
        while (true) {
            if (!aVar.hasNext()) {
                next = null;
                break;
            }
            next = aVar.next();
            if (L.f(((MessageBody.SystemMessageBody.Platform.Bubble.Image) next).getImageId(), str)) {
                break;
            }
        }
        MessageBody.SystemMessageBody.Platform.Bubble.Image image4 = (MessageBody.SystemMessageBody.Platform.Bubble.Image) next;
        return (image4 == null || (image = image4.getImage()) == null) ? new Q<>(null, null) : new Q<>(b(480, image), b(60, image));
    }
}
