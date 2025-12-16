package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class yxb extends hn6 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerChatsListWidget b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxb(PickerChatsListWidget pickerChatsListWidget, int i) {
        super(1, cq7.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$6$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget;I)Z", 0);
        this.a = i;
        switch (i) {
            case 1:
                this.b = pickerChatsListWidget;
                super(1, cq7.class, "isChatItem", "checkBoxItemDecoration_delegate$lambda$6$isChatItem(Lone/me/chats/picker/chats/PickerChatsListWidget;I)Z", 0);
                break;
            default:
                this.b = pickerChatsListWidget;
                break;
        }
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(PickerChatsListWidget.y0(this.b, ((Number) obj).intValue()));
            default:
                return Boolean.valueOf(PickerChatsListWidget.y0(this.b, ((Number) obj).intValue()));
        }
    }
}
