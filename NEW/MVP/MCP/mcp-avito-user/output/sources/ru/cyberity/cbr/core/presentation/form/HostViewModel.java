package ru.cyberity.cbr.core.presentation.form;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.n2;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;

/* compiled from: HostViewModel.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003!\"#J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006$À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "field", "", "value", "Lkotlin/G0;", "onFieldValueChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/lang/String;)V", "", "values", "onFieldValuesChanged", "(Lru/cyberity/cbr/core/presentation/form/model/FormItem;Ljava/util/List;)V", "Landroid/content/Context;", "context", "Lru/cyberity/cbr/core/presentation/form/FieldId;", "fieldId", "Landroid/net/Uri;", "uris", "onPickedFiles", "(Landroid/content/Context;Lru/cyberity/cbr/core/presentation/form/FieldId;Ljava/util/List;)V", "item", "fileId", "onDeleteFile", "Lkotlinx/coroutines/flow/n2;", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", "getFormViewState", "()Lkotlinx/coroutines/flow/n2;", "formViewState", "Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "getItemValueCache", "()Lru/cyberity/cbr/core/presentation/form/ItemValueCache;", "itemValueCache", "FormViewState", "Page", "ValidationStrings", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public interface HostViewModel {

    /* compiled from: HostViewModel.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010!\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/cyberity/cbr/core/presentation/form/HostViewModel$FormViewState;", "", "", "currentPageIndex", "", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "pages", "", "mimeTypes", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "validationStrings", "<init>", "(ILjava/util/List;Ljava/lang/String;Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentPageIndex", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "Ljava/lang/String;", "getMimeTypes", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "getValidationStrings", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "getCurrentPage", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "currentPage", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class FormViewState {
        private final int currentPageIndex;

        @l
        private final String mimeTypes;

        @k
        private final List<Page> pages;

        @l
        private final ValidationStrings validationStrings;

        public FormViewState(int i12, @k List<Page> list, @l String str, @l ValidationStrings validationStrings) {
            this.currentPageIndex = i12;
            this.pages = list;
            this.mimeTypes = str;
            this.validationStrings = validationStrings;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormViewState)) {
                return false;
            }
            FormViewState formViewState = (FormViewState) other;
            return this.currentPageIndex == formViewState.currentPageIndex && L.f(this.pages, formViewState.pages) && L.f(this.mimeTypes, formViewState.mimeTypes) && L.f(this.validationStrings, formViewState.validationStrings);
        }

        @l
        public final Page getCurrentPage() {
            return (Page) C42745f0.K(this.currentPageIndex, this.pages);
        }

        public final int getCurrentPageIndex() {
            return this.currentPageIndex;
        }

        @l
        public final String getMimeTypes() {
            return this.mimeTypes;
        }

        @k
        public final List<Page> getPages() {
            return this.pages;
        }

        @l
        public final ValidationStrings getValidationStrings() {
            return this.validationStrings;
        }

        public int hashCode() {
            int iE2 = H.e(Integer.hashCode(this.currentPageIndex) * 31, 31, this.pages);
            String str = this.mimeTypes;
            int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            ValidationStrings validationStrings = this.validationStrings;
            return iHashCode + (validationStrings != null ? validationStrings.hashCode() : 0);
        }

        @k
        public String toString() {
            return "FormViewState(currentPageIndex=" + this.currentPageIndex + ", pages=" + this.pages + ", mimeTypes=" + this.mimeTypes + ", validationStrings=" + this.validationStrings + ')';
        }
    }

    /* compiled from: HostViewModel.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "Landroid/os/Parcelable;", "", "index", "", "title", "subtitle", "", "Lru/cyberity/cbr/core/presentation/form/model/FormItem;", "items", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getIndex", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Page implements Parcelable {

        @k
        public static final Parcelable.Creator<Page> CREATOR = new Creator();
        private final int index;

        @k
        private final List<FormItem> items;

        @l
        private final String subtitle;

        @l
        private final String title;

        /* compiled from: HostViewModel.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Page> {
            @Override // android.os.Parcelable.Creator
            @k
            public final Page createFromParcel(@k Parcel parcel) {
                int i12 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i13 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = a.l(Page.class, parcel, arrayList, iL2, 1);
                }
                return new Page(i12, string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            @k
            public final Page[] newArray(int i12) {
                return new Page[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Page(int i12, @l String str, @l String str2, @k List<? extends FormItem> list) {
            this.index = i12;
            this.title = str;
            this.subtitle = str2;
            this.items = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Page copy$default(Page page, int i12, String str, String str2, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = page.index;
            }
            if ((i13 & 2) != 0) {
                str = page.title;
            }
            if ((i13 & 4) != 0) {
                str2 = page.subtitle;
            }
            if ((i13 & 8) != 0) {
                list = page.items;
            }
            return page.copy(i12, str, str2, list);
        }

        @k
        public final Page copy(int index, @l String title, @l String subtitle, @k List<? extends FormItem> items) {
            return new Page(index, title, subtitle, items);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Page)) {
                return false;
            }
            Page page = (Page) other;
            return this.index == page.index && L.f(this.title, page.title) && L.f(this.subtitle, page.subtitle) && L.f(this.items, page.items);
        }

        public final int getIndex() {
            return this.index;
        }

        @k
        public final List<FormItem> getItems() {
            return this.items;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.index) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitle;
            return this.items.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Page(index=");
            sb2.append(this.index);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", items=");
            return H.p(sb2, this.items, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.index);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Iterator itJ = C0.j(this.items, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    /* compiled from: HostViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\b¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/presentation/form/HostViewModel$ValidationStrings;", "", "", "isRequired", "isNotValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ValidationStrings {

        @l
        private final String isNotValid;

        @l
        private final String isRequired;

        /* JADX WARN: Multi-variable type inference failed */
        public ValidationStrings() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidationStrings)) {
                return false;
            }
            ValidationStrings validationStrings = (ValidationStrings) other;
            return L.f(this.isRequired, validationStrings.isRequired) && L.f(this.isNotValid, validationStrings.isNotValid);
        }

        public int hashCode() {
            String str = this.isRequired;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.isNotValid;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @l
        /* renamed from: isNotValid, reason: from getter */
        public final String getIsNotValid() {
            return this.isNotValid;
        }

        @l
        /* renamed from: isRequired, reason: from getter */
        public final String getIsRequired() {
            return this.isRequired;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ValidationStrings(isRequired=");
            sb2.append(this.isRequired);
            sb2.append(", isNotValid=");
            return C22026a.c(sb2, this.isNotValid, ')');
        }

        public ValidationStrings(@l String str, @l String str2) {
            this.isRequired = str;
            this.isNotValid = str2;
        }

        public /* synthetic */ ValidationStrings(String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
        }
    }

    @k
    n2<FormViewState> getFormViewState();

    @k
    ItemValueCache getItemValueCache();

    default void onDeleteFile(@k FormItem item, @k String fileId) {
    }

    default void onFieldValueChanged(@k FormItem field, @l String value) {
    }

    default void onFieldValuesChanged(@k FormItem field, @l List<String> values) {
    }

    default void onPickedFiles(@k Context context, @k FieldId fieldId, @k List<? extends Uri> uris) {
    }
}
