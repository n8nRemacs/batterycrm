package com.avito.android.search.filter.location_filter;

import android.content.Intent;
import com.avito.android.B2;
import com.avito.android.publish.FlowType;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.DialogDisplaying;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SortDirection;
import com.avito.android.remote.model.category_parameters.SuggestLocationParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.LocationInfo;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.select.bottom_sheet.SelectBottomSheetActivity;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.suggest_locations.OpenEventFromBlock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: LocationFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/converter/ParameterElement;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.l<?, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f263647l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar) {
        super(1);
        this.f263647l = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        ParameterSlot parameterSlotFindParameter;
        Integer numY0;
        String title;
        String str;
        Boolean areGroupsCollapsible;
        DialogDisplaying dialogDisplaying;
        Boolean withImages;
        String title2;
        DialogDisplaying dialogDisplaying2;
        Boolean withImages2;
        ParameterElement parameterElement = (ParameterElement) obj;
        r rVar = this.f263647l;
        ParametersTreeWithAdditional parametersTreeWithAdditional = rVar.f263665l;
        if (parametersTreeWithAdditional != null && (parameterSlotFindParameter = parametersTreeWithAdditional.findParameter(parameterElement.getF121424b())) != null) {
            boolean z12 = parameterElement instanceof ParameterElement.v;
            com.avito.android.select.s sVar = rVar.f263672s;
            FiltersInteractor filtersInteractor = rVar.f263654a;
            if (z12) {
                if (parameterSlotFindParameter instanceof AddressesSearchParameter) {
                    String locationId = filtersInteractor.f().getLocationId();
                    List<? extends SuggestAddress> value = ((AddressesSearchParameter) parameterSlotFindParameter).getValue();
                    if (value == null) {
                        value = C42784z0.f406748b;
                    }
                    List<? extends SuggestAddress> list = value;
                    LocationFiltersDialogFragment locationFiltersDialogFragment = rVar.f263677x;
                    if (locationFiltersDialogFragment != null) {
                        com.avito.android.suggest_addresses.g gVar = locationFiltersDialogFragment.f263449r0;
                        locationFiltersDialogFragment.startActivityForResult((gVar != null ? gVar : null).a(new SuggestAddressesParams(locationId, list, false, 4, null)), 4);
                    }
                } else if (parameterSlotFindParameter instanceof SelectParameter) {
                    SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
                    SelectParameter.Value selectedValue = selectParameter.getSelectedValue();
                    List listSingletonList = selectedValue != null ? Collections.singletonList(selectedValue) : C42784z0.f406748b;
                    SelectParameter.Displaying displaying = selectParameter.getDisplaying();
                    SortDirection sortDirection = displaying != null ? displaying.getSortDirection() : null;
                    List<ParcelableEntity<String>> listA = sortDirection != null ? sVar.a(selectParameter.getListToShow(), sortDirection) : selectParameter.getListToShow();
                    SelectParameter.Displaying displaying2 = selectParameter.getDisplaying();
                    boolean zBooleanValue = (displaying2 == null || (withImages2 = displaying2.getWithImages()) == null) ? false : withImages2.booleanValue();
                    boolean z13 = !zBooleanValue;
                    String id2 = selectParameter.getId();
                    SelectParameter.Displaying displaying3 = selectParameter.getDisplaying();
                    if (displaying3 == null || (dialogDisplaying2 = displaying3.getDialogDisplaying()) == null || (title2 = dialogDisplaying2.getDialogTitle()) == null) {
                        title2 = selectParameter.getTitle();
                    }
                    String str2 = title2;
                    Boolean typoCorrectionEnabled = selectParameter.getTypoCorrectionEnabled();
                    boolean zBooleanValue2 = typoCorrectionEnabled != null ? typoCorrectionEnabled.booleanValue() : false;
                    Integer attributeId = selectParameter.getAttributeId();
                    SelectParameter.Displaying displaying4 = selectParameter.getDisplaying();
                    String titlePattern = displaying4 != null ? displaying4.getTitlePattern() : null;
                    SelectParameter.Displaying displaying5 = selectParameter.getDisplaying();
                    com.avito.android.select.Arguments arguments = new com.avito.android.select.Arguments(false, id2, null, listA, listSingletonList, str2, null, z13, false, false, false, false, true, false, zBooleanValue2, attributeId, zBooleanValue, titlePattern, displaying5 != null ? displaying5.getImageParams() : null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -515259, 255, null);
                    LocationFiltersDialogFragment locationFiltersDialogFragment2 = rVar.f263677x;
                    if (locationFiltersDialogFragment2 != null) {
                        locationFiltersDialogFragment2.startActivityForResult(new Intent(locationFiltersDialogFragment2.requireContext(), (Class<?>) SelectBottomSheetActivity.class).putExtra("select_arguments", arguments), 3);
                    }
                } else {
                    boolean z14 = parameterSlotFindParameter instanceof LocationParameter;
                    com.avito.android.search.filter.analytics.c cVar = rVar.f263658e;
                    if (z14) {
                        String strQ = r.q(rVar);
                        LocationParameter locationParameter = (LocationParameter) parameterSlotFindParameter;
                        LocationFiltersDialogFragment locationFiltersDialogFragment3 = rVar.f263677x;
                        if (locationFiltersDialogFragment3 != null) {
                            Location value2 = locationParameter.getValue();
                            String id3 = value2 != null ? value2.getId() : null;
                            int iC2 = cVar.c();
                            String strG = cVar.g();
                            InterfaceC35139d interfaceC35139d = locationFiltersDialogFragment3.f263445n0;
                            locationFiltersDialogFragment3.startActivityForResult((interfaceC35139d != null ? interfaceC35139d : null).a(id3, strQ, Integer.valueOf(iC2), null, null, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : null, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : strG, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE), 1);
                        }
                    } else if (parameterSlotFindParameter instanceof RadiusParameter) {
                        SearchParams searchParamsF = filtersInteractor.f();
                        RadiusParameter radiusParameter = (RadiusParameter) parameterSlotFindParameter;
                        B2 b22 = rVar.f263664k;
                        b22.getClass();
                        kotlin.reflect.n<Object> nVar = B2.f67184X[4];
                        String categoryId = ((Boolean) b22.f67212f.a().invoke()).booleanValue() ? searchParamsF.getCategoryId() : null;
                        LocationFiltersDialogFragment locationFiltersDialogFragment4 = rVar.f263677x;
                        if (locationFiltersDialogFragment4 != null) {
                            Radius value3 = radiusParameter.getValue();
                            PublishIntentFactory publishIntentFactory = locationFiltersDialogFragment4.f263446o0;
                            locationFiltersDialogFragment4.startActivityForResult((publishIntentFactory != null ? publishIntentFactory : null).g((2046 & 1) != 0 ? null : null, (2046 & 4) != 0 ? null : value3, (2046 & 8) != 0 ? null : categoryId, (2046 & 16) != 0 ? PublishIntentFactory.LocationPickerChooseButtonLocation.f231991b : null, (2046 & 32) != 0 ? null : searchParamsF, (2046 & 64) != 0 ? null : null, (2046 & 128) != 0 ? null : null, (2046 & 256) == 0, (2046 & 1024) != 0 ? null : null, FlowType.f231904d), 2);
                        }
                    } else if (parameterSlotFindParameter instanceof SuggestLocationParameter) {
                        String strQ2 = r.q(rVar);
                        SuggestLocationParameter suggestLocationParameter = (SuggestLocationParameter) parameterSlotFindParameter;
                        LocationFiltersDialogFragment locationFiltersDialogFragment5 = rVar.f263677x;
                        if (locationFiltersDialogFragment5 != null) {
                            Location value4 = suggestLocationParameter.getValue();
                            String id4 = value4 != null ? value4.getId() : null;
                            OpenEventFromBlock[] openEventFromBlockArr = OpenEventFromBlock.f292117b;
                            String strG2 = cVar.g();
                            InterfaceC35139d interfaceC35139d2 = locationFiltersDialogFragment5.f263445n0;
                            locationFiltersDialogFragment5.startActivityForResult((interfaceC35139d2 != null ? interfaceC35139d2 : null).a(id4, strQ2, 16, null, null, null, (32576 & 64) != 0 ? PublishIntentFactory.SuggestLocationsFlowType.Default.f231995b : null, (32576 & 128) != 0 ? null : null, (32576 & 256) != 0 ? null : null, (32576 & 2048) != 0 ? null : strG2, (32576 & 8192) != 0 ? null : null, (32576 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : Boolean.TRUE), 5);
                        }
                    }
                }
            } else if (parameterElement instanceof ParameterElement.s) {
                if (parameterSlotFindParameter instanceof MultiselectParameter) {
                    MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
                    List<MultiselectParameter.Value> values = multiselectParameter.getValues();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : values) {
                        MultiselectParameter.Value value5 = (MultiselectParameter.Value) obj2;
                        List<? extends String> value6 = multiselectParameter.getValue();
                        if (value6 != null ? value6.contains(value5.getId()) : false) {
                            arrayList.add(obj2);
                        }
                    }
                    MultiselectParameter.Displaying displaying6 = multiselectParameter.getDisplaying();
                    SortDirection sortDirection2 = displaying6 != null ? displaying6.getSortDirection() : null;
                    List<MultiselectParameter.Value> listA2 = sortDirection2 != null ? sVar.a(multiselectParameter.getValues(), sortDirection2) : multiselectParameter.getValues();
                    MultiselectParameter.Displaying displaying7 = multiselectParameter.getDisplaying();
                    boolean zBooleanValue3 = (displaying7 == null || (withImages = displaying7.getWithImages()) == null) ? false : withImages.booleanValue();
                    boolean z15 = !zBooleanValue3;
                    MultiselectParameter.Displaying displaying8 = multiselectParameter.getDisplaying();
                    List<MultiselectParameter.Displaying.Group> groups = displaying8 != null ? displaying8.getGroups() : null;
                    MultiselectParameter.Displaying displaying9 = multiselectParameter.getDisplaying();
                    if (displaying9 == null || (dialogDisplaying = displaying9.getDialogDisplaying()) == null || (title = dialogDisplaying.getDialogTitle()) == null) {
                        title = multiselectParameter.getTitle();
                    }
                    if (!(title.length() > 0)) {
                        title = null;
                    }
                    if (title == null) {
                        MultiselectParameter.Displaying displaying10 = multiselectParameter.getDisplaying();
                        String placeholder = displaying10 != null ? displaying10.getPlaceholder() : null;
                        if (placeholder == null) {
                            placeholder = "";
                        }
                        str = placeholder;
                    } else {
                        str = title;
                    }
                    String id5 = multiselectParameter.getId();
                    List<ParcelableEntity<String>> listB = rVar.f263662i.b(groups, listA2);
                    Boolean typoCorrectionEnabled2 = multiselectParameter.getTypoCorrectionEnabled();
                    boolean zBooleanValue4 = typoCorrectionEnabled2 != null ? typoCorrectionEnabled2.booleanValue() : false;
                    MultiselectParameter.Displaying displaying11 = multiselectParameter.getDisplaying();
                    if (displaying11 != null && (areGroupsCollapsible = displaying11.getAreGroupsCollapsible()) != null) {
                        zBooleanValue = areGroupsCollapsible.booleanValue();
                    }
                    boolean z16 = zBooleanValue;
                    Integer attributeId2 = multiselectParameter.getAttributeId();
                    MultiselectParameter.Displaying displaying12 = multiselectParameter.getDisplaying();
                    String titlePattern2 = displaying12 != null ? displaying12.getTitlePattern() : null;
                    MultiselectParameter.Displaying displaying13 = multiselectParameter.getDisplaying();
                    com.avito.android.select.Arguments arguments2 = new com.avito.android.select.Arguments(false, id5, groups, listB, arrayList, str, null, z15, false, false, true, false, true, z16, zBooleanValue4, attributeId2, zBooleanValue3, titlePattern2, displaying13 != null ? displaying13.getImageParams() : null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, false, false, 0, null, null, -523455, 255, null);
                    LocationFiltersDialogFragment locationFiltersDialogFragment6 = rVar.f263677x;
                    if (locationFiltersDialogFragment6 != null) {
                        locationFiltersDialogFragment6.startActivityForResult(new Intent(locationFiltersDialogFragment6.requireContext(), (Class<?>) SelectBottomSheetActivity.class).putExtra("select_arguments", arguments2), 3);
                    }
                } else if (parameterSlotFindParameter instanceof MetroParameter) {
                    MetroParameter metroParameter = (MetroParameter) parameterSlotFindParameter;
                    SearchParams searchParamsF2 = filtersInteractor.f();
                    String locationId2 = searchParamsF2.getLocationId();
                    String categoryId2 = searchParamsF2.getCategoryId();
                    LocationFiltersDialogFragment locationFiltersDialogFragment7 = rVar.f263677x;
                    if (locationFiltersDialogFragment7 != null) {
                        MetroResponseBody metroResponseBodyY = filtersInteractor.y();
                        String id6 = metroParameter.getId();
                        int iIntValue = (locationId2 == null || (numY0 = C43066x.y0(locationId2)) == null) ? -1 : numY0.intValue();
                        Integer numY02 = categoryId2 != null ? C43066x.y0(categoryId2) : null;
                        List<? extends Metro> value7 = metroParameter.getValue();
                        if (value7 == null) {
                            value7 = C42784z0.f406748b;
                        }
                        List<? extends Metro> list2 = value7;
                        com.avito.android.select.new_metro.j jVar = locationFiltersDialogFragment7.f263447p0;
                        locationFiltersDialogFragment7.startActivityForResult((jVar != null ? jVar : null).a(metroResponseBodyY, id6, iIntValue, numY02, null, false, list2, null), 3);
                    }
                } else if (parameterSlotFindParameter instanceof DistrictParameter) {
                    DistrictParameter districtParameter = (DistrictParameter) parameterSlotFindParameter;
                    SearchParams searchParamsF3 = filtersInteractor.f();
                    String locationId3 = searchParamsF3.getLocationId();
                    String categoryId3 = searchParamsF3.getCategoryId();
                    LocationFiltersDialogFragment locationFiltersDialogFragment8 = rVar.f263677x;
                    if (locationFiltersDialogFragment8 != null) {
                        LocationInfo locationInfoS = filtersInteractor.getF261789z();
                        DistrictsWithRegions districtsWithRegions = locationInfoS != null ? locationInfoS.f261879f : null;
                        String id7 = districtParameter.getId();
                        if (locationId3 != null) {
                            C43066x.y0(locationId3);
                        }
                        if (categoryId3 != null) {
                            C43066x.y0(categoryId3);
                        }
                        List<? extends District> value8 = districtParameter.getValue();
                        if (value8 == null) {
                            value8 = C42784z0.f406748b;
                        }
                        if (districtsWithRegions != null) {
                            com.avito.android.select.new_districts.e eVar = locationFiltersDialogFragment8.f263448q0;
                            locationFiltersDialogFragment8.startActivityForResult((eVar != null ? eVar : null).a(districtsWithRegions, id7, value8), 3);
                        }
                    }
                }
            }
        }
        return G0.f406611a;
    }
}
