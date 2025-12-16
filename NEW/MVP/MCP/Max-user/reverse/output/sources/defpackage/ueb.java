package defpackage;

import android.text.InputFilter;

/* loaded from: classes2.dex */
public final class ueb extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ veb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ueb(veb vebVar, int i, boolean z) {
        super(12, (Object) null);
        this.c = i;
        this.d = vebVar;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    veb.b(this.d, (k18) obj2);
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    veb vebVar = this.d;
                    veb.c(vebVar, iIntValue, vebVar.getText().length());
                    break;
                }
                break;
            case 2:
                if (!fni.a(obj, obj2)) {
                    veb.d(this.d, (teb) obj2);
                    break;
                }
                break;
            case 3:
                if (!fni.a(obj, obj2)) {
                    v1a v1aVar = a93.s0;
                    veb vebVar2 = this.d;
                    vebVar2.onThemeChanged(v1aVar.y(vebVar2));
                    break;
                }
                break;
            case 4:
                if (!fni.a(obj, obj2)) {
                    this.d.a.setHint((String) obj2);
                    break;
                }
                break;
            case 5:
                if (!fni.a(obj, obj2)) {
                    this.d.a.setFilters((InputFilter[]) obj2);
                    break;
                }
                break;
            case 6:
                if (!fni.a(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    v1a v1aVar2 = a93.s0;
                    veb vebVar3 = this.d;
                    vebVar3.onThemeChanged(v1aVar2.y(vebVar3));
                    break;
                }
                break;
            case 7:
                if (!fni.a(obj, obj2)) {
                    ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    v1a v1aVar3 = a93.s0;
                    veb vebVar4 = this.d;
                    vebVar4.onThemeChanged(v1aVar3.y(vebVar4));
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    seb sebVar = (seb) obj2;
                    if (sebVar != null) {
                        v1a v1aVar4 = a93.s0;
                        veb vebVar5 = this.d;
                        vebVar5.i(v1aVar4.y(vebVar5), sebVar);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ueb(Object obj, veb vebVar, int i) {
        super(12, obj);
        this.c = i;
        this.d = vebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ueb(veb vebVar, int i) {
        super(12, (Object) 0);
        this.c = i;
        switch (i) {
            case 2:
                this.d = vebVar;
                super(12, teb.a);
                break;
            case 3:
            default:
                this.d = vebVar;
                break;
            case 4:
                this.d = vebVar;
                super(12, "");
                break;
        }
    }
}
