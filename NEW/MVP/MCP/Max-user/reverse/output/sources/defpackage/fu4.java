package defpackage;

import android.text.InputFilter;

/* loaded from: classes2.dex */
public final class fu4 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gu4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fu4(Integer num, gu4 gu4Var, int i) {
        super(12, num);
        this.c = i;
        this.d = gu4Var;
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!fni.a(obj, obj2)) {
                    gu4 gu4Var = this.d;
                    gu4Var.s0.setFilters(gu4Var.getMaxCount() != Integer.MAX_VALUE ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(gu4Var.getMaxCount())} : new InputFilter[0]);
                    break;
                }
                break;
            case 1:
                if (!fni.a(obj, obj2)) {
                    v1a v1aVar = a93.s0;
                    gu4 gu4Var2 = this.d;
                    gu4Var2.onThemeChanged(v1aVar.y(gu4Var2));
                    break;
                }
                break;
            case 2:
                if (!fni.a(obj, obj2)) {
                    v1a v1aVar2 = a93.s0;
                    gu4 gu4Var3 = this.d;
                    gu4Var3.onThemeChanged(v1aVar2.y(gu4Var3));
                    break;
                }
                break;
            case 3:
                if (!fni.a(obj, obj2)) {
                    v1a v1aVar3 = a93.s0;
                    gu4 gu4Var4 = this.d;
                    gu4Var4.onThemeChanged(v1aVar3.y(gu4Var4));
                    break;
                }
                break;
            default:
                if (!fni.a(obj, obj2)) {
                    v1a v1aVar4 = a93.s0;
                    gu4 gu4Var5 = this.d;
                    gu4Var5.onThemeChanged(v1aVar4.y(gu4Var5));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu4(gu4 gu4Var, int i) {
        super(12, (Object) Integer.MAX_VALUE);
        this.c = i;
        switch (i) {
            case 1:
                this.d = gu4Var;
                super(12, (Object) null);
                break;
            default:
                this.d = gu4Var;
                break;
        }
    }
}
