package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nr implements en6 {
    public final /* synthetic */ xr a;

    public nr(xr xrVar) {
        this.a = xrVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nr) || obj == null) {
            return false;
        }
        return getFunctionDelegate().equals(((en6) obj).getFunctionDelegate());
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        return new hn6(1, 0, xr.class, this.a, "selectTheme", "selectTheme(Lone/me/appearancesettings/multitheme/model/ThemeItem;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
