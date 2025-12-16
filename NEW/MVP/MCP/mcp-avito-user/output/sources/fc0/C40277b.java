package fC0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff.remote.model.edit.BottomSheetAction;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: TariffSheet.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"LfC0/b;", "", "", ChannelContext.Item.USER_ID, "", "isClosable", "title", "", "Lcom/avito/android/remote/model/text/AttributedText;", "descriptions", "Lcom/avito/android/tariff/remote/model/edit/BottomSheetAction;", "actions", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "Z", "()Z", "c", "Ljava/util/List;", "b", "()Ljava/util/List;", "a", "_avito_tariff_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40277b {

    @c("actions")
    @l
    private final List<BottomSheetAction> actions;

    @c("descriptions")
    @k
    private final List<AttributedText> descriptions;

    @c("isClosable")
    private final boolean isClosable;

    @c("title")
    @k
    private final String title;

    @c(ChannelContext.Item.USER_ID)
    @k
    private final String userId;

    public C40277b(@k String str, boolean z12, @k String str2, @k List<AttributedText> list, @l List<BottomSheetAction> list2) {
        this.userId = str;
        this.isClosable = z12;
        this.title = str2;
        this.descriptions = list;
        this.actions = list2;
    }

    @l
    public final List<BottomSheetAction> a() {
        return this.actions;
    }

    @k
    public final List<AttributedText> b() {
        return this.descriptions;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
