package net.bytebuddy.utility.visitor;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.jar.asm.s;

/* compiled from: LocalVariableAwareMethodVisitor.java */
/* loaded from: classes7.dex */
public class c extends s {

    /* renamed from: d, reason: collision with root package name */
    public int f418997d;

    @Override // net.bytebuddy.jar.asm.s
    @SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
    public final void J(int i12, int i13) {
        switch (i12) {
            case 54:
            case 56:
            case 58:
                this.f418997d = Math.max(this.f418997d, i13 + 1);
                break;
            case 55:
            case 57:
                this.f418997d = Math.max(this.f418997d, i13 + 2);
                break;
        }
        super.J(i12, i13);
    }
}
