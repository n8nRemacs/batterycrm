package com.avito.android.crm_candidates.view.base;

import Ns.InterfaceC14607b;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.ActivityC22955m;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCrmAddNoteFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNs/b;", "event", "Lkotlin/G0;", "invoke", "(LNs/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.crm_candidates.view.base.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29627e extends kotlin.jvm.internal.N implements Y41.l<InterfaceC14607b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JobCrmAddNoteFragment f129917l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29627e(JobCrmAddNoteFragment jobCrmAddNoteFragment) {
        super(1);
        this.f129917l = jobCrmAddNoteFragment;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC14607b interfaceC14607b) {
        InterfaceC14607b interfaceC14607b2 = interfaceC14607b;
        boolean z12 = interfaceC14607b2 instanceof InterfaceC14607b.a;
        JobCrmAddNoteFragment jobCrmAddNoteFragment = this.f129917l;
        if (z12) {
            Input input = jobCrmAddNoteFragment.f129777o0;
            if (input == null) {
                input = null;
            }
            InterfaceC14607b.a aVar = (InterfaceC14607b.a) interfaceC14607b2;
            Input.t(input, aVar.f11776a, false, 6);
            Input input2 = jobCrmAddNoteFragment.f129777o0;
            if (input2 == null) {
                input2 = null;
            }
            input2.setRightIcon((Drawable) null);
            Input input3 = jobCrmAddNoteFragment.f129778p0;
            if (input3 == null) {
                input3 = null;
            }
            Input.t(input3, aVar.f11778c, false, 6);
            Button button = jobCrmAddNoteFragment.f129779q0;
            if (button == null) {
                button = null;
            }
            button.setText(aVar.f11777b);
            Input input4 = jobCrmAddNoteFragment.f129778p0;
            com.avito.android.lib.design.input.n.c(input4 != null ? input4 : null, new C29626d(jobCrmAddNoteFragment));
        } else if (interfaceC14607b2 instanceof InterfaceC14607b.C0767b) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(jobCrmAddNoteFragment.getResources().getString(R.string.crm_error));
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.c(cVar, jobCrmAddNoteFragment, printableTextF, null, null, f.c.a.b(), 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
        } else if (interfaceC14607b2 instanceof InterfaceC14607b.c) {
            ActivityC22955m activityC22955mRequireActivity = jobCrmAddNoteFragment.requireActivity();
            Intent intent = new Intent();
            intent.putExtra("job_crm_new_note_result", ((InterfaceC14607b.c) interfaceC14607b2).f11780a);
            G0 g02 = G0.f406611a;
            activityC22955mRequireActivity.setResult(-1, intent);
            activityC22955mRequireActivity.finish();
        }
        return G0.f406611a;
    }
}
