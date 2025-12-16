package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Portfolio.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u000eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u000e¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/Portfolio;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/PortfolioProject;", "projects", "Lcom/avito/android/remote/model/PortfolioAction;", "actions", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/Portfolio;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getProjects", "getActions", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Portfolio implements Parcelable {

    @k
    public static final Parcelable.Creator<Portfolio> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<PortfolioAction> actions;

    @c("projects")
    @k
    private final List<PortfolioProject> projects;

    @c("title")
    @k
    private final String title;

    /* compiled from: Portfolio.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Portfolio> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Portfolio createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = a.c(PortfolioProject.CREATOR, parcel, arrayList2, iC3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(PortfolioAction.CREATOR, parcel, arrayList3, iC2, 1);
                }
                arrayList = arrayList3;
            }
            return new Portfolio(string, arrayList2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Portfolio[] newArray(int i12) {
            return new Portfolio[i12];
        }
    }

    public Portfolio(@k String str, @k List<PortfolioProject> list, @l List<PortfolioAction> list2) {
        this.title = str;
        this.projects = list;
        this.actions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Portfolio copy$default(Portfolio portfolio, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = portfolio.title;
        }
        if ((i12 & 2) != 0) {
            list = portfolio.projects;
        }
        if ((i12 & 4) != 0) {
            list2 = portfolio.actions;
        }
        return portfolio.copy(str, list, list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<PortfolioProject> component2() {
        return this.projects;
    }

    @l
    public final List<PortfolioAction> component3() {
        return this.actions;
    }

    @k
    public final Portfolio copy(@k String title, @k List<PortfolioProject> projects, @l List<PortfolioAction> actions) {
        return new Portfolio(title, projects, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Portfolio)) {
            return false;
        }
        Portfolio portfolio = (Portfolio) other;
        return L.f(this.title, portfolio.title) && L.f(this.projects, portfolio.projects) && L.f(this.actions, portfolio.actions);
    }

    @l
    public final List<PortfolioAction> getActions() {
        return this.actions;
    }

    @k
    public final List<PortfolioProject> getProjects() {
        return this.projects;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = H.e(this.title.hashCode() * 31, 31, this.projects);
        List<PortfolioAction> list = this.actions;
        return iE2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Portfolio(title=");
        sb2.append(this.title);
        sb2.append(", projects=");
        sb2.append(this.projects);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.projects, parcel);
        while (itJ.hasNext()) {
            ((PortfolioProject) itJ.next()).writeToParcel(parcel, flags);
        }
        List<PortfolioAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((PortfolioAction) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
