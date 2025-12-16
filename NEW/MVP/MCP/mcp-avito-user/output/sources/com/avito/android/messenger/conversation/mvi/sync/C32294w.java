package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32275m;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import ru.avito.messenger.api.entity.Image;

/* compiled from: MessageAndQuoteBodyResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "Lru/avito/messenger/api/entity/Image;", "imageById", "", "Lcom/avito/android/messenger/conversation/mvi/sync/m$b;", "apply", "(Ljava/util/Map;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32294w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<C32275m.a> f194869b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C32275m f194870c;

    public C32294w(C32275m c32275m, List list) {
        this.f194869b = list;
        this.f194870c = c32275m;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        C32275m.b bVarA;
        MessageBody.Link.Preview preview;
        MessageBody.Link.Preview previewCopy$default;
        String imageId;
        Image image;
        Map map = (Map) obj;
        List<C32275m.a> list = this.f194869b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (C32275m.a aVar : list) {
            MessageBody.Link link = (MessageBody.Link) aVar.f194813c;
            MessageBody.Link.Preview preview2 = link.getPreview();
            com.avito.android.remote.model.Image image2 = preview2 != null ? preview2.getImage() : null;
            MessageBody.Link.Preview preview3 = link.getPreview();
            com.avito.android.remote.model.Image image3 = (preview3 == null || (imageId = preview3.getImageId()) == null || (image = (Image) map.get(imageId)) == null) ? null : this.f194870c.f194809b.e(image).getImage();
            if (image2 != null || image3 == null) {
                bVarA = aVar.a();
            } else {
                MessageBody.Link.Preview preview4 = link.getPreview();
                if (preview4 != null) {
                    if (preview4 instanceof MessageBody.Link.Preview.Snippet) {
                        previewCopy$default = MessageBody.Link.Preview.Snippet.copy$default((MessageBody.Link.Preview.Snippet) preview4, null, null, null, false, null, null, null, null, image3, null, null, null, 3839, null);
                    } else {
                        if (!(preview4 instanceof MessageBody.Link.Preview.Image)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        previewCopy$default = MessageBody.Link.Preview.Image.copy$default((MessageBody.Link.Preview.Image) preview4, null, null, false, null, image3, null, null, null, 239, null);
                    }
                    preview = previewCopy$default;
                } else {
                    preview = null;
                }
                bVarA = aVar.b(MessageBody.Link.copy$default(link, null, preview, null, false, 13, null));
            }
            arrayList.add(bVarA);
        }
        return arrayList;
    }
}
