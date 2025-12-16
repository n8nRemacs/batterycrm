package com.avito.android.evidence_request.mvi.data.evidence_request;

import Y41.p;
import Y61.k;
import android.content.res.Resources;
import android.net.Uri;
import com.avito.android.R;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.evidence_request.mvi.domain.evidence_request.EvidenceContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofType;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofTypesContent;
import com.avito.android.evidence_request.mvi.evidence_details.adapter.headerDescription.HeaderDescriptionItem;
import com.avito.android.remote.ModerationEvidence;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.EmailParameter;
import com.avito.android.remote.model.category_parameters.HeaderDescriptionParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlot;
import com.avito.android.remote.model.category_parameters.slot.information.InformationSlotConfig;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.conveyor_item.ParcelableItem;
import com.facebook.imageutils.JfifUtil;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: EvidenceRequestRepository.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/data/evidence_request/b;", "Lcom/avito/android/evidence_request/mvi/data/evidence_request/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.evidence_request.mvi.data.evidence_request.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f148646a;

    /* compiled from: EvidenceRequestRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ModerationEvidence.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModerationEvidence moderationEvidence = ModerationEvidence.f253035c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ModerationEvidence moderationEvidence2 = ModerationEvidence.f253035c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ModerationEvidence moderationEvidence3 = ModerationEvidence.f253035c;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ModerationEvidence moderationEvidence4 = ModerationEvidence.f253035c;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: EvidenceRequestRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "Lcom/avito/android/evidence_request/mvi/domain/evidence_request/ProofDetailsContent;", "details", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/evidence_request/mvi/domain/evidence_request/ProofDetailsContent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.evidence_request.mvi.data.evidence_request.b$b, reason: collision with other inner class name */
    public static final class C4358b extends N implements p<String, ProofDetailsContent, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f148647l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4358b(LinkedHashMap linkedHashMap) {
            super(2);
            this.f148647l = linkedHashMap;
        }

        @Override // Y41.p
        public final G0 invoke(String str, ProofDetailsContent proofDetailsContent) {
            this.f148647l.put(str, proofDetailsContent);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k Resources resources) {
        this.f148646a = resources;
    }

    public static ProofType h(b bVar, String str, String str2, p pVar, AttributedText attributedText, List list, int i12) {
        return bVar.g(str, str2, pVar, bVar.f148646a.getString(R.string.proof_default_title), (i12 & 16) != 0 ? i(bVar.f148646a.getString(R.string.proof_default_description)) : attributedText, list, C42784z0.f406748b, false);
    }

    public static AttributedText i(String str) {
        return new AttributedText(str, C42784z0.f406748b, 0, 4, null);
    }

    @Override // com.avito.android.evidence_request.mvi.data.evidence_request.a
    @k
    public final EvidenceContent a(@k ModerationEvidence moderationEvidence) {
        List listSingletonList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4358b c4358b = new C4358b(linkedHashMap);
        int iOrdinal = moderationEvidence.ordinal();
        Resources resources = this.f148646a;
        if (iOrdinal == 0) {
            listSingletonList = Collections.singletonList(h(this, "cadastral_number", resources.getString(R.string.cadastral_proof_title), c4358b, i(resources.getString(R.string.cadastral_proof_description)), C42745f0.U(new CharParameter("surname", resources.getString(R.string.owner_surname_title), true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex(resources.getString(R.string.name_regex), null, resources.getString(R.string.owner_surname_constraint_message), "error", "surname:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null), new CharParameter("name", resources.getString(R.string.owner_name_title), true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex(resources.getString(R.string.name_regex), null, resources.getString(R.string.owner_name_constraint_message), "error", "name:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null), new CharParameter("patronymic", resources.getString(R.string.owner_patronymic_title), false, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex(resources.getString(R.string.name_regex), null, resources.getString(R.string.owner_patronymic_constraint_message), "error", "patronymic:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null), new CharParameter("cadastral_number", resources.getString(R.string.cadastr_title), true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex(resources.getString(R.string.cadastral_regex), null, resources.getString(R.string.cadastr_constraint_message), "error", "cadastral_number:regexp", null, null, 98, null)), null, "12:34:567890:0000", null, null, null, null, null, null, 259568, null)), 200));
        } else if (iOrdinal == 1) {
            listSingletonList = Collections.singletonList(h(this, "video_way", resources.getString(R.string.extended_video_way_proof_title), c4358b, i(resources.getString(R.string.extended_video_way_proof_description)), C42745f0.U(e("videoURL", resources.getString(R.string.video_link_field_title), resources.getString(R.string.video_link_field_motivation), resources.getString(R.string.video_link_field_hint)), f(), c()), 200));
        } else if (iOrdinal == 2) {
            listSingletonList = C42745f0.U(b("video_way", resources.getString(R.string.video_way_proof_title), c4358b, Collections.singletonList(e("videoURL", resources.getString(R.string.video_link_field_title), resources.getString(R.string.video_link_field_motivation), resources.getString(R.string.video_link_field_hint)))), b("ownership_certificate", resources.getString(R.string.ownership_proof_title), c4358b, Collections.singletonList(d(resources.getString(R.string.ownership_proof_description)))), b("contract", resources.getString(R.string.contract_proof_title), c4358b, Collections.singletonList(d(resources.getString(R.string.contract_proof_description)))), b("new_building_flat_link", resources.getString(R.string.flat_link_proof_title), c4358b, Collections.singletonList(e("flatLink", resources.getString(R.string.flat_link_proof_link_title), null, ""))), b("new_building_project_declaration", resources.getString(R.string.project_declaration_proof_title), c4358b, C42745f0.U(new IntParameter("flatNumber", resources.getString(R.string.project_declaration_proof_flat_number_title), true, false, null, null, null, null, null, null, resources.getString(R.string.project_declaration_proof_flat_number_placeholder), null, null, null, null, 31728, null), e("projectDeclarationURL", resources.getString(R.string.project_declaration_proof_url_title), null, ""), new IntParameter("projectDeclarationFlatPageNumber", resources.getString(R.string.project_declaration_proof_page_number_title), true, false, null, null, null, null, null, null, resources.getString(R.string.project_declaration_proof_page_number_placeholder), null, null, null, null, 31728, null))));
        } else if (iOrdinal == 3) {
            listSingletonList = Collections.singletonList(g("archive_extract", resources.getString(R.string.archive_proof_title), c4358b, resources.getString(R.string.archive_proff_details_title), new AttributedText(resources.getString(R.string.archive_proof_details_description), Collections.singletonList(new DeepLinkAttribute("howto", resources.getString(R.string.archive_proof_deeplink_title), new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2815"), null, null, 6, null), null, null, null, 56, null)), 0, 4, null), C42745f0.U(new HeaderDescriptionParameter(resources.getString(R.string.archive_proof_header_title), resources.getString(R.string.archive_proof_header_subtitle)), new CharParameter("surname", resources.getString(R.string.archive_proof_surname_title), false, false, i(resources.getString(R.string.archive_proof_surname_motivation)), null, null, null, null, null, null, "", null, null, null, null, null, null, 260064, null), new CharParameter("name", resources.getString(R.string.archive_proof_name_title), false, false, null, null, null, null, null, null, null, "", null, null, null, null, null, null, 260080, null), new CharParameter("patronymic", resources.getString(R.string.archive_proof_patronymic_title), false, false, null, null, null, null, null, null, null, "", null, null, null, null, null, null, 260080, null), new PhotoParameter("files", resources.getString(R.string.archive_proof_photo_title), resources.getString(R.string.archive_proof_photo_description), null, 10, null, null, false, false, null, null, null, null, 8040, null)), Collections.singletonList(new HeaderDescriptionItem("header", resources.getString(R.string.archive_proof_top_items_header_title), i(resources.getString(R.string.archive_proof_top_items_header_subtitle)))), true));
        } else {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            listSingletonList = C42784z0.f406748b;
        }
        return new EvidenceContent(new ProofTypesContent(resources.getString(R.string.choose_confirmation_method), resources.getString(R.string.proof_type_description), listSingletonList), linkedHashMap);
    }

    public final ProofType b(String str, String str2, p<? super String, ? super ProofDetailsContent, G0> pVar, List<? extends ParameterSlot> list) {
        return h(this, str, str2, pVar, null, C42745f0.h0(list, C42745f0.e0(f(), c())), JfifUtil.MARKER_SOI);
    }

    public final EmailParameter c() {
        Resources resources = this.f148646a;
        return new EmailParameter("email", resources.getString(R.string.email_field_title), true, false, null, null, null, null, Collections.singletonList(new Constraint.Regex("", null, resources.getString(R.string.email_field_constraint_message), "error", "email:regexp", null, null, 98, null)), "", null, null, 3312, null);
    }

    public final PhotoParameter d(String str) throws Resources.NotFoundException {
        Resources resources = this.f148646a;
        return new PhotoParameter("files_id", resources.getString(R.string.files_field_title), str, null, 100, Collections.singletonList(new Constraint.Limit(Float.valueOf(1.0f), null, "error", resources.getString(R.string.files_field_message), "files_id:limit", null, null, 98, null)), null, true, false, null, null, null, null, 8008, null);
    }

    public final CharParameter e(String str, String str2, String str3, String str4) {
        CharParameter.InputType inputType = CharParameter.InputType.URI;
        return new CharParameter(str, str2, true, false, str3 != null ? new AttributedText(str3, C42784z0.f406748b, 0, 4, null) : null, null, null, null, null, Collections.singletonList(new Constraint.Regex("\\S+\\.\\S+", null, this.f148646a.getString(R.string.link_field_constraint_message), "error", str.concat(":regexp"), null, null, 98, null)), null, str4, null, inputType, null, null, null, null, 251360, null);
    }

    public final CharParameter f() {
        Resources resources = this.f148646a;
        return new CharParameter("fullName", resources.getString(R.string.name_field_title), true, false, null, null, null, null, null, Collections.singletonList(new Constraint.Regex(resources.getString(R.string.user_name_regex), null, resources.getString(R.string.name_field_constraint_message), "error", "name:regexp", null, null, 98, null)), null, "", null, null, null, null, null, null, 259568, null);
    }

    public final ProofType g(String str, String str2, p<? super String, ? super ProofDetailsContent, G0> pVar, String str3, AttributedText attributedText, List<? extends ParameterSlot> list, List<? extends ParcelableItem> list2, boolean z12) {
        List<? extends ParameterSlot> listI0;
        if (z12) {
            listI0 = list;
        } else {
            SlotType slotType = SlotType.INFORMATION;
            Resources resources = this.f148646a;
            listI0 = C42745f0.i0(new InformationSlot(ServiceTransportationWidget.DisclaimerField.TYPE, "", new SlotWidget(slotType, new InformationSlotConfig(new AttributedText(resources.getString(R.string.agreement_title), Collections.singletonList(new DeepLinkAttribute("agreement", resources.getString(R.string.agreement_deeplink_title), new WebViewLink.AnyDomain(Uri.parse("https://www.avito.ru/safety/personal/company"), null, null, 6, null), null, null, null, 56, null)), 0, 4, null), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null))), list);
        }
        ((C4358b) pVar).invoke(str, new ProofDetailsContent(str3, list2, listI0, z12, attributedText));
        return new ProofType(str, str2);
    }
}
