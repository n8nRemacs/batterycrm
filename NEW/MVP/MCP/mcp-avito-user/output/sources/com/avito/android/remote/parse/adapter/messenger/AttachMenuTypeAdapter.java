package com.avito.android.remote.parse.adapter.messenger;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenu;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AttachMenuTypeAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/AttachMenuTypeAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "Lcom/google/gson/o;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AttachMenuTypeAdapter implements h<AttachMenu>, o<AttachMenu> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        AttachMenu attachMenu = (AttachMenu) obj;
        k kVar = new k();
        AttachMenuItem.File file = attachMenu.getFile();
        if (file != null) {
            kVar.t("file", nVar.c(file));
        }
        AttachMenuItem.Image image = attachMenu.getImage();
        if (image != null) {
            kVar.t("image", nVar.c(image));
        }
        AttachMenuItem.Video video = attachMenu.getVideo();
        if (video != null) {
            kVar.t("video", nVar.c(video));
        }
        AttachMenuItem.Item item = attachMenu.getItem();
        if (item != null) {
            kVar.t("item", nVar.c(item));
        }
        AttachMenuItem.Location location = attachMenu.getLocation();
        if (location != null) {
            kVar.t("location", nVar.c(location));
        }
        AttachMenuItem.Support support = attachMenu.getSupport();
        if (support != null) {
            kVar.t(AttachMenuItem.Support.KEY, nVar.c(support));
        }
        AttachMenuItem.Replies replies = attachMenu.getReplies();
        if (replies != null) {
            kVar.t(AttachMenuItem.Replies.KEY, nVar.c(replies));
        }
        AttachMenuItem.Voice voice = attachMenu.getVoice();
        if (voice != null) {
            kVar.t("voice", nVar.c(voice));
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final AttachMenu deserialize(i iVar, Type type, g gVar) {
        if (!(iVar instanceof k)) {
            if (iVar instanceof j) {
                return null;
            }
            throw new IllegalArgumentException("Unexpected json: " + iVar);
        }
        k kVarI = iVar.i();
        i iVarD = kVarI.D("file");
        AttachMenuItem.File file = (AttachMenuItem.File) (iVarD == null ? null : gVar.b(iVarD, AttachMenuItem.File.class));
        i iVarD2 = kVarI.D("image");
        AttachMenuItem.Image image = (AttachMenuItem.Image) (iVarD2 == null ? null : gVar.b(iVarD2, AttachMenuItem.Image.class));
        i iVarD3 = kVarI.D("video");
        AttachMenuItem.Video video = (AttachMenuItem.Video) (iVarD3 == null ? null : gVar.b(iVarD3, AttachMenuItem.Video.class));
        i iVarD4 = kVarI.D("item");
        AttachMenuItem.Item item = (AttachMenuItem.Item) (iVarD4 == null ? null : gVar.b(iVarD4, AttachMenuItem.Item.class));
        i iVarD5 = kVarI.D("location");
        AttachMenuItem.Location location = (AttachMenuItem.Location) (iVarD5 == null ? null : gVar.b(iVarD5, AttachMenuItem.Location.class));
        i iVarD6 = kVarI.D(AttachMenuItem.Support.KEY);
        AttachMenuItem.Support support = (AttachMenuItem.Support) (iVarD6 == null ? null : gVar.b(iVarD6, AttachMenuItem.Support.class));
        i iVarD7 = kVarI.D(AttachMenuItem.Replies.KEY);
        AttachMenuItem.Replies replies = (AttachMenuItem.Replies) (iVarD7 == null ? null : gVar.b(iVarD7, AttachMenuItem.Replies.class));
        i iVarD8 = kVarI.D("voice");
        return new AttachMenu(file, image, video, item, location, replies, (AttachMenuItem.Voice) (iVarD8 != null ? gVar.b(iVarD8, AttachMenuItem.Voice.class) : null), support);
    }
}
