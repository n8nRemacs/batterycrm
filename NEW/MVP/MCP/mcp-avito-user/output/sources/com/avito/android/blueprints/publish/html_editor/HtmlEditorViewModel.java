package com.avito.android.blueprints.publish.html_editor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import com.avito.android.html_editor.EditorNavigationEvent;
import com.avito.android.html_formatter.FormatChange;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HtmlEditorViewModelImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel;", "", "HistoryState", "b", "c", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface HtmlEditorViewModel {

    /* compiled from: HtmlEditorViewModelImpl.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$HistoryState;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class HistoryState implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<HistoryState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f106240b;

        /* renamed from: c, reason: collision with root package name */
        public int f106241c;

        /* compiled from: HtmlEditorViewModelImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HistoryState> {
            @Override // android.os.Parcelable.Creator
            public final HistoryState createFromParcel(Parcel parcel) {
                return new HistoryState(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final HistoryState[] newArray(int i12) {
                return new HistoryState[i12];
            }
        }

        public HistoryState(int i12, int i13) {
            this.f106240b = i12;
            this.f106241c = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryState)) {
                return false;
            }
            HistoryState historyState = (HistoryState) obj;
            return this.f106240b == historyState.f106240b && this.f106241c == historyState.f106241c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f106241c) + (Integer.hashCode(this.f106240b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HistoryState(snapshotsCount=");
            sb2.append(this.f106240b);
            sb2.append(", currentSnapshot=");
            return androidx.appcompat.app.r.t(sb2, this.f106241c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f106240b);
            parcel.writeInt(this.f106241c);
        }
    }

    /* compiled from: HtmlEditorViewModelImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: HtmlEditorViewModelImpl.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$b;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f106242a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f106243b;

        public b(boolean z12, boolean z13) {
            this.f106242a = z12;
            this.f106243b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f106242a == bVar.f106242a && this.f106243b == bVar.f106243b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f106243b) + (Boolean.hashCode(this.f106242a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NavigationButtonsState(undoEnabled=");
            sb2.append(this.f106242a);
            sb2.append(", redoEnabled=");
            return androidx.appcompat.app.r.x(sb2, this.f106243b, ')');
        }
    }

    /* compiled from: HtmlEditorViewModelImpl.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c$a;", "Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: HtmlEditorViewModelImpl.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c$a;", "Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f106244a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: HtmlEditorViewModelImpl.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c$b;", "Lcom/avito/android/blueprints/publish/html_editor/HtmlEditorViewModel$c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f106245a;

            public b(@Y61.k String str) {
                super(null);
                this.f106245a = str;
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    @Y61.k
    com.jakewharton.rxrelay3.c Fa(@Y61.k String str);

    @Y61.k
    /* renamed from: G9 */
    C23038g0 getF106309P();

    @Y61.k
    /* renamed from: Jd */
    C23038g0 getF106311R();

    @Y61.k
    com.jakewharton.rxrelay3.c R9(@Y61.k String str);

    void a7(@Y61.k EditorNavigationEvent editorNavigationEvent);

    void bd(@Y61.k FormatChange formatChange);

    void e2(@Y61.k c cVar);

    boolean n2();

    void setFormat(int i12);

    @Y61.k
    com.jakewharton.rxrelay3.c v7(@Y61.k String str);

    @Y61.k
    /* renamed from: x6 */
    C23038g0 getF106310Q();

    void y7(@Y61.k com.avito.android.html_editor.d dVar, boolean z12);
}
