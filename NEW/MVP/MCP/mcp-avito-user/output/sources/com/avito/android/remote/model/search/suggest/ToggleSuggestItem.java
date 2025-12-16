package com.avito.android.remote.model.search.suggest;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SuggestItem.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u0005\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/ToggleSuggestItem;", "Lcom/avito/android/remote/model/search/suggest/SuggestItem;", "", "id", "", "isChecked", "", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "actions", "", "lines", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "<init>", "(Ljava/lang/String;ZLjava/util/List;ILcom/avito/android/remote/model/text/AttributedText;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "()Z", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "I", "getLines", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ToggleSuggestItem extends SuggestItem {

    @k
    public static final Parcelable.Creator<ToggleSuggestItem> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<SuggestAction> actions;

    @c("id")
    @k
    private final String id;

    @c("isChecked")
    private final boolean isChecked;

    @c("numberOfLines")
    private final int lines;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: SuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ToggleSuggestItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ToggleSuggestItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(ToggleSuggestItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ToggleSuggestItem(string, z12, arrayList, parcel.readInt(), (AttributedText) parcel.readParcelable(ToggleSuggestItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ToggleSuggestItem[] newArray(int i12) {
            return new ToggleSuggestItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleSuggestItem(@k String str, boolean z12, @l List<? extends SuggestAction> list, int i12, @k AttributedText attributedText) {
        super(null);
        this.id = str;
        this.isChecked = z12;
        this.actions = list;
        this.lines = i12;
        this.title = attributedText;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<SuggestAction> getActions() {
        return this.actions;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int getLines() {
        return this.lines;
    }

    @k
    public final AttributedText getTitle() {
        return this.title;
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeInt(this.isChecked ? 1 : 0);
        List<SuggestAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeInt(this.lines);
        parcel.writeParcelable(this.title, flags);
    }
}
