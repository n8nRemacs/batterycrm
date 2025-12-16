package com.avito.android.messenger.conversation.chat_header;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.app.r;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.collection.o1;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: ItemTitleAndPriceView.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR*\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/ItemTitleAndPriceView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "", "value", "q", "Ljava/lang/String;", "getTitleText", "()Ljava/lang/String;", "setTitleText", "(Ljava/lang/String;)V", "titleText", "r", "getPriceText", "setPriceText", "priceText", "", "s", "Z", "getSingleLine", "()Z", "setSingleLine", "(Z)V", "singleLine", "SavedState", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ItemTitleAndPriceView extends LinearLayoutCompat {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f189367u = 0;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public String titleText;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @l
    public String priceText;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean singleLine;

    /* renamed from: t, reason: collision with root package name */
    public boolean f189371t;

    /* compiled from: ItemTitleAndPriceView.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/ItemTitleAndPriceView$SavedState;", "Landroid/view/View$BaseSavedState;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SavedState extends View.BaseSavedState {

        @X41.f
        @Y61.k
        public static final Parcelable.Creator<SavedState> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f189372b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f189373c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f189374d;

        /* compiled from: ItemTitleAndPriceView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/messenger/conversation/chat_header/ItemTitleAndPriceView$SavedState;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.l<Parcel, SavedState> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f189375l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final SavedState invoke(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        /* compiled from: ItemTitleAndPriceView.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/chat_header/ItemTitleAndPriceView$SavedState$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/messenger/conversation/chat_header/ItemTitleAndPriceView$SavedState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new b(null);
            a aVar = a.f189375l;
            int i12 = I3.f318630a;
            CREATOR = new H3(aVar);
        }

        public SavedState(Parcel parcel, C42822w c42822w) {
            super(parcel);
            this.f189372b = "";
            String string = parcel.readString();
            this.f189372b = string != null ? string : "";
            this.f189373c = parcel.readString();
            this.f189374d = J3.c(parcel);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ItemTitleAndPriceView.SavedState('");
            sb2.append(this.f189372b);
            sb2.append("', '");
            sb2.append(this.f189373c);
            sb2.append("', ");
            return r.x(sb2, this.f189374d, ')');
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeString(this.f189372b);
            parcel.writeString(this.f189373c);
            boolean z12 = this.f189374d;
            o1<ClassLoader, o1<String, Parcelable.Creator<?>>> o1Var = J3.f318636a;
            parcel.writeInt(z12 ? 1 : 0);
        }
    }

    @l
    public final String getPriceText() {
        return this.priceText;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    @Y61.k
    public final String getTitleText() {
        return this.titleText;
    }

    public final void n() {
        if (this.f189371t) {
            return;
        }
        this.f189371t = true;
        post(new Runnable() { // from class: com.avito.android.messenger.conversation.chat_header.i
            @Override // java.lang.Runnable
            public final void run() {
                ItemTitleAndPriceView itemTitleAndPriceView = this.f189482b;
                itemTitleAndPriceView.f189371t = false;
                String str = itemTitleAndPriceView.priceText;
                boolean z12 = itemTitleAndPriceView.singleLine;
                if (str != null && !C43066x.K(str)) {
                    "· ".concat(str);
                    throw null;
                }
                if (!z12) {
                    throw null;
                }
                throw null;
            }
        });
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@l Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setTitleText(savedState.f189372b);
        setPriceText(savedState.f189373c);
        setSingleLine(savedState.f189374d);
    }

    @Override // android.view.View
    @l
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f189372b = this.titleText;
        savedState.f189373c = this.priceText;
        savedState.f189374d = this.singleLine;
        return savedState;
    }

    public final void setPriceText(@l String str) {
        if (L.f(str, this.priceText)) {
            return;
        }
        this.priceText = str;
        n();
    }

    public final void setSingleLine(boolean z12) {
        if (z12 != this.singleLine) {
            this.singleLine = z12;
            n();
        }
    }

    public final void setTitleText(@Y61.k String str) {
        if (str.equals(this.titleText)) {
            return;
        }
        this.titleText = str;
        n();
    }
}
