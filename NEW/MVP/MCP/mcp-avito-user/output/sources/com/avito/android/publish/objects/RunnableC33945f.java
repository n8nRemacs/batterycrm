package com.avito.android.publish.objects;

import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.details.SelectItemBaseFragment;
import com.avito.android.publish.view.ItemDetailsBaseFragment;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.select.SelectResult;
import com.avito.android.select_districts.SelectDistrictsResult;
import com.avito.android.util.K2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.objects.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class RunnableC33945f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f238035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f238036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f238037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f238038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f238039f;

    public /* synthetic */ RunnableC33945f(int i12, int i13, Intent intent, SelectItemBaseFragment selectItemBaseFragment, int i14) {
        this.f238035b = i14;
        this.f238036c = i12;
        this.f238037d = i13;
        this.f238038e = intent;
        this.f238039f = selectItemBaseFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f238035b) {
            case 0:
                int i12 = this.f238036c;
                if (i12 == -1) {
                    int i13 = this.f238037d;
                    ObjectFillFormFragment objectFillFormFragment = (ObjectFillFormFragment) this.f238039f;
                    if (i13 == 1) {
                        C33975x c33975x = objectFillFormFragment.f237550w0;
                        C33975x c33975x2 = c33975x != null ? c33975x : null;
                        if (i12 != -1) {
                            ObjectFillFormFragment objectFillFormFragment2 = c33975x2.f238130e0;
                            if (objectFillFormFragment2 != null) {
                                objectFillFormFragment2.E0();
                                break;
                            }
                        } else {
                            c33975x2.se();
                            break;
                        }
                    } else if (i13 == 1004) {
                        Intent intent = (Intent) this.f238038e;
                        AddressParameter.Value value = intent != null ? (AddressParameter.Value) intent.getParcelableExtra("EXTRA_ADDRESS_RESULT") : null;
                        String stringExtra = intent != null ? intent.getStringExtra("EXTRA_ADDRESS_PARAM_ID") : null;
                        if (value != null) {
                            com.avito.android.details.b bVar = objectFillFormFragment.f135892n0;
                            (bVar != null ? bVar : null).E(value, stringExtra);
                            break;
                        }
                    }
                }
                break;
            case 1:
                int i14 = this.f238036c;
                int i15 = this.f238037d;
                Intent intent2 = (Intent) this.f238038e;
                ItemDetailsBaseFragment itemDetailsBaseFragment = (ItemDetailsBaseFragment) this.f238039f;
                if (i14 == -1) {
                    switch (i15) {
                        case ErrorCodes.PROTOCOL_EXCEPTION /* 1004 */:
                            AddressParameter.Value value2 = intent2 != null ? (AddressParameter.Value) intent2.getParcelableExtra("EXTRA_ADDRESS_RESULT") : null;
                            if (value2 != null) {
                                com.avito.android.details.b bVar2 = itemDetailsBaseFragment.f135892n0;
                                (bVar2 != null ? bVar2 : null).F4(value2);
                                break;
                            }
                            break;
                        case 1005:
                            SelectResult selectResult = intent2 != null ? (SelectResult) intent2.getParcelableExtra("select_result") : null;
                            if (selectResult != null) {
                                com.avito.android.details.b bVar3 = itemDetailsBaseFragment.f135892n0;
                                (bVar3 != null ? bVar3 : null).j(selectResult.f264977b, selectResult.f264979d, selectResult.f264978c);
                                break;
                            }
                            break;
                        case ErrorCodes.SSL_HANDSHAKE_EXCEPTION /* 1006 */:
                            SelectDistrictsResult selectDistrictsResult = intent2 != null ? (SelectDistrictsResult) intent2.getParcelableExtra("extra_select_districts_result") : null;
                            if (selectDistrictsResult != null) {
                                com.avito.android.details.b bVar4 = itemDetailsBaseFragment.f135892n0;
                                if (bVar4 == null) {
                                    bVar4 = null;
                                }
                                bVar4.j(selectDistrictsResult.f266908b, null, selectDistrictsResult.f266909c);
                                break;
                            }
                            break;
                    }
                }
                itemDetailsBaseFragment.s5(i15, i14, intent2);
                break;
            default:
                K2.g((View) this.f238038e, this.f238036c, (InputMethodManager) this.f238039f, this.f238037d - 1);
                break;
        }
    }

    public /* synthetic */ RunnableC33945f(View view, int i12, InputMethodManager inputMethodManager, int i13) {
        this.f238035b = 2;
        this.f238038e = view;
        this.f238036c = i12;
        this.f238039f = inputMethodManager;
        this.f238037d = i13;
    }
}
