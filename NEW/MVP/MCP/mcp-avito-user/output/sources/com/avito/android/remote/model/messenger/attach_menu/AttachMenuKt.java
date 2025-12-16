package com.avito.android.remote.model.messenger.attach_menu;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: AttachMenu.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0018\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"isEmpty", "", "Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;", "(Lcom/avito/android/remote/model/messenger/attach_menu/AttachMenu;)Z", "isNotEmpty", "isNullOrEmpty", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class AttachMenuKt {
    public static final boolean isEmpty(@k AttachMenu attachMenu) {
        return attachMenu.getFile() == null && attachMenu.getImage() == null && attachMenu.getVideo() == null && attachMenu.getItem() == null && attachMenu.getLocation() == null && attachMenu.getSupport() == null;
    }

    public static final boolean isNotEmpty(@k AttachMenu attachMenu) {
        return !(attachMenu.getFile() == null && attachMenu.getImage() == null && attachMenu.getVideo() == null && attachMenu.getItem() == null && attachMenu.getLocation() == null && attachMenu.getSupport() == null);
    }

    public static final boolean isNullOrEmpty(@l AttachMenu attachMenu) {
        return attachMenu == null || (attachMenu.getFile() == null && attachMenu.getImage() == null && attachMenu.getVideo() == null && attachMenu.getItem() == null && attachMenu.getLocation() == null && attachMenu.getSupport() == null);
    }
}
