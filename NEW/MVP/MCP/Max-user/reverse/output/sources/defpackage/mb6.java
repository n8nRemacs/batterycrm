package defpackage;

/* loaded from: classes2.dex */
public final class mb6 implements t98 {
    public final long X;
    public final int Y = hyc.oneme_folder_widget_view_type;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final lb6 o;

    public mb6(long j, String str, String str2, String str3, lb6 lb6Var) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.o = lb6Var;
        this.X = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb6)) {
            return false;
        }
        mb6 mb6Var = (mb6) obj;
        return this.a == mb6Var.a && this.b.equals(mb6Var.b) && fni.a(this.c, mb6Var.c) && fni.a(this.d, mb6Var.d) && fni.a(this.o, mb6Var.o);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        CharSequence charSequence = this.c;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        lb6 lb6Var = this.o;
        return iHashCode3 + (lb6Var != null ? lb6Var.hashCode() : 0);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.Y;
    }

    public final String toString() {
        return "FolderWidgetItem(id=" + this.a + ", name=" + ((Object) this.b) + ", description=" + ((Object) this.c) + ", iconUrl=" + this.d + ", clickAction=" + this.o + ")";
    }
}
