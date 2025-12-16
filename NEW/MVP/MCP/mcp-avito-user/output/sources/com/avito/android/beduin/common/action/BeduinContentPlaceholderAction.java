package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinContentPlaceholderAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "()V", "Hide", "Show", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Hide;", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinContentPlaceholderAction implements BeduinAction {

    /* compiled from: BeduinContentPlaceholderAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Hide;", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Hide extends BeduinContentPlaceholderAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f99970b = new a(null);

        @Y61.k
        public static final Parcelable.Creator<Hide> CREATOR = new b();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Class<Hide> f99971c = Hide.class;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final String f99972d = "hideContentPlaceholder";

        /* compiled from: BeduinContentPlaceholderAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Hide$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC15524c {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            public final Class<Hide> getAction() {
                return Hide.f99971c;
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            /* renamed from: getType */
            public final String getF99987c() {
                return Hide.f99972d;
            }

            public a() {
            }
        }

        /* compiled from: BeduinContentPlaceholderAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Hide> {
            @Override // android.os.Parcelable.Creator
            public final Hide createFromParcel(Parcel parcel) {
                parcel.readInt();
                return new Hide();
            }

            @Override // android.os.Parcelable.Creator
            public final Hide[] newArray(int i12) {
                return new Hide[i12];
            }
        }

        public Hide() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return Hide.class.equals(obj != null ? obj.getClass() : null);
        }

        public final int hashCode() {
            return Hide.class.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: BeduinContentPlaceholderAction.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show;", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction;", "", "title", "subtitle", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "image", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show$Button;", "button", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show$Button;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "d", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show$Button;", "c", "()Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show$Button;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "e", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Button", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Show extends BeduinContentPlaceholderAction {

        @com.google.gson.annotations.c("button")
        @l
        private final Button button;

        @com.google.gson.annotations.c("image")
        @l
        private final LocalIcon image;

        @com.google.gson.annotations.c("subtitle")
        @l
        private final String subtitle;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
        @l
        private final BeduinComponentTheme theme;

        @com.google.gson.annotations.c("title")
        @l
        private final String title;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f99973b = new a(null);

        @Y61.k
        public static final Parcelable.Creator<Show> CREATOR = new b();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final Class<Show> f99974c = Show.class;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final String f99975d = "showContentPlaceholder";

        /* compiled from: BeduinContentPlaceholderAction.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show$Button;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            @com.google.gson.annotations.c("onTapActions")
            @Y61.k
            private final List<BeduinAction> onTapActions;

            @com.google.gson.annotations.c("title")
            @Y61.k
            private final String title;

            /* compiled from: BeduinContentPlaceholderAction.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    String string = parcel.readString();
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Button.class, parcel, arrayList, iL2, 1);
                    }
                    return new Button(string, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Button(@Y61.k String str, @Y61.k List<? extends BeduinAction> list) {
                this.title = str;
                this.onTapActions = list;
            }

            @Y61.k
            public final List<BeduinAction> c() {
                return this.onTapActions;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return L.f(this.title, button.title) && L.f(this.onTapActions, button.onTapActions);
            }

            @Y61.k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.onTapActions.hashCode() + (this.title.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(title=");
                sb2.append(this.title);
                sb2.append(", onTapActions=");
                return H.p(sb2, this.onTapActions, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                Iterator itJ = C0.j(this.onTapActions, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
            }
        }

        /* compiled from: BeduinContentPlaceholderAction.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinContentPlaceholderAction$Show$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC15524c {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            public final Class<Show> getAction() {
                return Show.f99974c;
            }

            @Override // Ui.InterfaceC15524c
            @Y61.k
            /* renamed from: getType */
            public final String getF99987c() {
                return Show.f99975d;
            }

            public a() {
            }
        }

        /* compiled from: BeduinContentPlaceholderAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class b implements Parcelable.Creator<Show> {
            @Override // android.os.Parcelable.Creator
            public final Show createFromParcel(Parcel parcel) {
                return new Show(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Show[] newArray(int i12) {
                return new Show[i12];
            }
        }

        public Show(@l String str, @l String str2, @l LocalIcon localIcon, @l Button button, @l BeduinComponentTheme beduinComponentTheme) {
            super(null);
            this.title = str;
            this.subtitle = str2;
            this.image = localIcon;
            this.button = button;
            this.theme = beduinComponentTheme;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Button getButton() {
            return this.button;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final LocalIcon getImage() {
            return this.image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final BeduinComponentTheme getTheme() {
            return this.theme;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Show)) {
                return false;
            }
            Show show = (Show) obj;
            return L.f(this.title, show.title) && L.f(this.subtitle, show.subtitle) && L.f(this.image, show.image) && L.f(this.button, show.button) && this.theme == show.theme;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            LocalIcon localIcon = this.image;
            int iHashCode3 = (iHashCode2 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
            Button button = this.button;
            int iHashCode4 = (iHashCode3 + (button == null ? 0 : button.hashCode())) * 31;
            BeduinComponentTheme beduinComponentTheme = this.theme;
            return iHashCode4 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Show(title=" + this.title + ", subtitle=" + this.subtitle + ", image=" + this.image + ", button=" + this.button + ", theme=" + this.theme + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            LocalIcon localIcon = this.image;
            if (localIcon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                localIcon.writeToParcel(parcel, i12);
            }
            Button button = this.button;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i12);
            }
            BeduinComponentTheme beduinComponentTheme = this.theme;
            if (beduinComponentTheme == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                beduinComponentTheme.writeToParcel(parcel, i12);
            }
        }
    }

    public /* synthetic */ BeduinContentPlaceholderAction(C42822w c42822w) {
        this();
    }

    private BeduinContentPlaceholderAction() {
    }
}
