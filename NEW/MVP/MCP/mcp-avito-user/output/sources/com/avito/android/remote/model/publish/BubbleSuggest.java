package com.avito.android.remote.model.publish;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BubbleSuggest.kt */
@d
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/publish/BubbleSuggest;", "Landroid/os/Parcelable;", "", "title", "replacementText", "Lcom/avito/android/remote/model/publish/BubbleSuggest$SuggestType;", "type", "", "Lcom/avito/android/remote/model/search/suggest/SuggestAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/publish/BubbleSuggest$SuggestType;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getReplacementText", "Lcom/avito/android/remote/model/publish/BubbleSuggest$SuggestType;", "getType", "()Lcom/avito/android/remote/model/publish/BubbleSuggest$SuggestType;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "SuggestType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BubbleSuggest implements Parcelable {

    @k
    public static final Parcelable.Creator<BubbleSuggest> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<SuggestAction> actions;

    @c("title")
    @k
    private final String replacementText;

    @c("text")
    @k
    private final String title;

    @c("type")
    @k
    private final SuggestType type;

    /* compiled from: BubbleSuggest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BubbleSuggest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BubbleSuggest createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            SuggestType suggestTypeValueOf = SuggestType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(BubbleSuggest.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BubbleSuggest(string, string2, suggestTypeValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BubbleSuggest[] newArray(int i12) {
            return new BubbleSuggest[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BubbleSuggest.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/publish/BubbleSuggest$SuggestType;", "", "(Ljava/lang/String;I)V", "NORMAL", "TYPO", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SuggestType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ SuggestType[] $VALUES;

        @c(Constants.NORMAL)
        public static final SuggestType NORMAL = new SuggestType("NORMAL", 0);

        @c("typo")
        public static final SuggestType TYPO = new SuggestType("TYPO", 1);

        private static final /* synthetic */ SuggestType[] $values() {
            return new SuggestType[]{NORMAL, TYPO};
        }

        static {
            SuggestType[] suggestTypeArr$values = $values();
            $VALUES = suggestTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(suggestTypeArr$values);
        }

        private SuggestType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<SuggestType> getEntries() {
            return $ENTRIES;
        }

        public static SuggestType valueOf(String str) {
            return (SuggestType) Enum.valueOf(SuggestType.class, str);
        }

        public static SuggestType[] values() {
            return (SuggestType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BubbleSuggest(@k String str, @k String str2, @k SuggestType suggestType, @l List<? extends SuggestAction> list) {
        this.title = str;
        this.replacementText = str2;
        this.type = suggestType;
        this.actions = list;
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
    public final String getReplacementText() {
        return this.replacementText;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final SuggestType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.replacementText);
        parcel.writeString(this.type.name());
        List<SuggestAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
